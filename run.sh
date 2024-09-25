#!/bin/bash

# ./update.sh

read -r ROWS COLS < <(stty size) > /dev/null

if [ "$ROWS" -lt "20" ] || [ "$COLS" -lt "32" ]; then
    if [ "$TERM" == "xterm-256color" ]; then
        resize -s 20 32 > /dev/null
        stty rows 30
        stty cols 80
    elif [ "$TERM" == "other term" ]; then
        echo "Too small"
    fi
fi

pwd > dir.txt

echo -ne "\033]0;Regex2English\007"

cd /usr/local/bin/regex2english # this seems to be run by a new process so no need to cd back

CLASSPATH=".:cli/libs/lanterna-3.1.2.jar:cli/libs/picocli-4.7.6.jar:"
# javac -d /cli/build/ -cp "$CLASSPATH" cli/myTextBoxRenderer.java cli/CLI.java 
javac -d /cli/build/ -cp "$CLASSPATH" cli/CLI.java 
java -cp "$CLASSPATH" cli/CLI.java -h

gradle clean > /dev/null

