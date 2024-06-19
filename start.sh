#!/bin/bash
read -r ROWS COLS < <(stty size) > /dev/null

if [ "$ROWS" -lt "20" ] || [ "$COLS" -lt "32" ]; then
    if [ "$TERM" == "xterm-256color" ]; then
        resize -s 20 32 > /dev/null
        stty rows 20
        stty cols 32
    elif [ "$TERM" == "other term" ]; then
        echo "Too small"
    fi
fi

CLASSPATH=".:cli/libs/lanterna-3.1.2.jar:cli/libs/picocli-4.7.6.jar:"
javac -cp "$CLASSPATH" cli/CLI.java
java -cp "$CLASSPATH" cli/CLI.java