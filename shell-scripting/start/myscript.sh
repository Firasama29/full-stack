#! /usr/bin/bash

# ECHO COMMAND

# NAME="world"
# echo hello ${NAME}

# echo hello $NAME
while read -r path;
do
    echo "path is $path"
done <myscript.sh
