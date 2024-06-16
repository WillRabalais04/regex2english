#!/bin/bash

CLASSPATH=".:cli/libs/lanterna-3.1.2.jar"
javac -cp "$CLASSPATH" cli/lanternaTest.java
java -cp "$CLASSPATH" cli/lanternaTest.java
gradle run

