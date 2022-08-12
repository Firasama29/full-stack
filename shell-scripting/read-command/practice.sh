#! /bin/bash
# allow user input
read -p "enter username: " user_name
# allow silent input 
read -sp "enter password: " password
# print output
echo username is $user_name

read -a  names
echo "current users:  ${names[0]}, ${names[1]}"