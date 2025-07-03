@echo off
set SRC_DIR=%~dp0
set JAVA_SRC=%SRC_DIR%Java_From_scratch
set CLASS_OUTPUT=%SRC_DIR%out

:: Compile the Java file
javac -d "%CLASS_OUTPUT%" "%JAVA_SRC%\%1.java"

:: Run the Java class using full package name
java -cp "%CLASS_OUTPUT%" %1
