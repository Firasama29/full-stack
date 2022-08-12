#testing foor loop to iterate through files
#! /usr/bin/bash
touch file1.txt file2.txt file3.txt file4.txt
FILES=$(ls *.txt)
NEW="new"
for FILE in $FILES
	do
		mv $FILE $NEW-$FILE
		echo "renamed $FILE into $NEW-$FILE"
	done 