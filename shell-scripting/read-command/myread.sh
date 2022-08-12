#! /bin/bash

#use read command to enter a text from terminal and print it into a file

echo "enter text: "
read text
echo "new topic saved: $text"
echo $text >> topics.txt