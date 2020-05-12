#!/bin/bash

function compileJavaFile(){
	javac -d ./classes/ -cp ./classes/ $1
}

for file in `find ./ -type f -name "*.java"`
do
	echo $file
	compileJavaFile $file
done
