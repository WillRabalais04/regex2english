#!/bin/bash
printf "\033]0;Regex2English\007"

VERBOSE=false
if [[ "$1" == "-v" || "$1" == "--verbose" ]]; then
    VERBOSE=true
    shift # remove the verbose flag from arguments passed to the app
fi

log() {
    if [ "$VERBOSE" = true ]; then
        echo "$@"
    fi
}

mkdir -p src/main/java/regex2english/libs
mkdir -p generated

download_if_missing() {
    local file=$1
    local url=$2
    if [ ! -f "$file" ]; then
        log "Downloading $(basename "$file")..."
        curl -L -o "$file" "$url"
    fi
}

download_if_missing "src/main/java/regex2english/libs/picocli-codegen-4.7.1.jar" \
    "https://repo1.maven.org/maven2/info/picocli/picocli-codegen/4.7.1/picocli-codegen-4.7.1.jar"

download_if_missing "src/main/java/regex2english/libs/antlr4-4.9.2-complete.jar" \
    "https://www.antlr.org/download/antlr-4.9.2-complete.jar"

download_if_missing "src/main/java/regex2english/libs/guava-32.1.1-jre.jar" \
    "https://repo1.maven.org/maven2/com/google/guava/guava/32.1.1-jre/guava-32.1.1-jre.jar"

GRAMMAR_FILE="src/main/antlr/regex2english.g4"
OUTPUT_DIR="generated/antlr"

if [ -f "$GRAMMAR_FILE" ] && { [ ! -d "$OUTPUT_DIR" ] || [ "$GRAMMAR_FILE" -nt "$OUTPUT_DIR" ]; }; then
    log "Generating ANTLR grammar files..."
    mkdir -p "$OUTPUT_DIR"
    
    java -jar src/main/java/regex2english/libs/antlr4-4.9.2-complete.jar \
        -visitor -no-listener -package regex2english.generated \
        "$GRAMMAR_FILE"
    
    # Move generated files to clean structure
    if [ -d "src/main/antlr" ]; then
        find . -name "*BaseListener.java" -o -name "*Lexer.java" -o -name "*Parser.java" -o -name "*Visitor.java" -o -name "*.tokens" -o -name "*.interp" | while read -r file; do
            if [[ "$file" != *"/generated/"* ]]; then
                mv "$file" "$OUTPUT_DIR/"
            fi
        done
    fi
    
    rm -rf "src/main/antlr/.antlr"
    rm -rf ".antlr"
fi

CLASSPATH=".:src/main/java:generated"
CLASSPATH="$CLASSPATH:src/main/java/regex2english/libs/lanterna-3.1.2.jar"
CLASSPATH="$CLASSPATH:src/main/java/regex2english/libs/picocli-4.7.6.jar"
CLASSPATH="$CLASSPATH:src/main/java/regex2english/libs/tree-printer-3.2.0.jar"
CLASSPATH="$CLASSPATH:src/main/java/regex2english/libs/picocli-codegen-4.7.1.jar"
CLASSPATH="$CLASSPATH:src/main/java/regex2english/libs/antlr4-4.9.2-complete.jar"
CLASSPATH="$CLASSPATH:src/main/java/regex2english/libs/guava-32.1.1-jre.jar"

log "Compiling Java files..."

mkdir -p generated/classes

JAVA_FILES=""
if [ -d "src/main/java" ]; then
    JAVA_FILES="$JAVA_FILES $(find src/main/java -name "*.java" | tr '\n' ' ')"
fi
if [ -d "generated" ]; then
    JAVA_FILES="$JAVA_FILES $(find generated -name "*.java" | tr '\n' ' ')"
fi

if [ -n "$JAVA_FILES" ]; then
    log "Compiling to generated folder..."
    javac -cp "$CLASSPATH" -d generated/classes $JAVA_FILES
    
    if [ $? -ne 0 ]; then
        echo "Compilation failed!"
        exit 1
    fi
else
    echo "No Java files found to compile"
    exit 1
fi

CLASSPATH="generated/classes:$CLASSPATH"

log "Running..."
java -cp "$CLASSPATH" regex2english.App "$@"

cleanup() {
    log "Cleaning up generated files..."
    rm -rf generated/
    find src/main/java -name "*.class" -delete 2>/dev/null || true
}

trap cleanup EXIT