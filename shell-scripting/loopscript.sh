#testing while loop to print lines of a paraghraph from text file

LINE=1
while read -r path
	do
	if [[ $path == *" "* ]]
		then
			echo "$LINE - $path"
			((LINE++))
		fi
		
	done <myfile.txt	