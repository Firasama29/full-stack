#!/bin/sh
read -r path

		echo "path is $path"
	if [[ $path != *"."* ]]
		then
			echo "${path} is rejected"
		fi

folder=`echo $path | awk -F'/' -v OFS='/' '{$NF=""}1'`
if [[ -e $folder ]]
then
	#mkdir -p $folder
	cp -r . folder/practice
	fi
done <topics.txt