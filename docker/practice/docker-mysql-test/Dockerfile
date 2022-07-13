FROM openjdk:8-jdk-alpine

# create a directory for docker container
RUN mkdir /app

# copy contents of host directory into the container directory
COPY target/ /app

#go into that directory
WORKDIR /app

# run the main class
CMD java App

# build the image using command docker build -t <image>:tag .
# create a container using command docker run my-image

