#!/bin/bash

CLASSPATH=".:cli/libs/lanterna-3.1.2.jar:cli/libs/picocli-4.7.6.jar:"

javac -cp "$CLASSPATH" cli/CLI.java
java -cp "$CLASSPATH" cli/CLI.java