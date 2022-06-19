Dockerfile: a text document that contains all the commands a user could call on the command line to assemble an image. When we tell Docker to build 
				  our image by executing the docker build command, Docker reads these instructions and execute them sequentially 
				  and creates a Docker image.

Docker commands
	
	list:
		docker images
		docker image ls
		docker image ls -a
		docker ps
		docker ps -a
		docker container ls
		docker container ls -a
		
	images
		docker pull <image>
		docker build											-> builds an image from a Dockerfile
		docker run <image>		NOTE: if image is not available locally, docker will pull it from dockerhub
		docker run -it <image>:tag								-> create a running container from an image
		docker run --name container_name <image>:tag			-> create a container from an image and give it a custom name
		docker run -d <image>:tag								-> create an image in a detached way
		docker run -e <image>:tag								-> create a container and specify environment variables
		docker run -it <image>:tag bash							-> to enter bash
		docker run -it <image>:tag sh							-> to enter shell
		docker inspect <image>									-> displays details of an image
		docker image inspect <image>							-> same thing
		docker image history <image>							-> shows history of an image
		docker image prune										-> remove unused images
		docker rmi <image_id>
	
	containers	
		docker-compose up
		docker-compose up -d
		docker container prune
		docker start <container_id>	or name
		docker stop <container_id>	or name
		docker restart <container_id>	or name
		docker pause <container_id>	or name
		docker kill <container_id>	or name
		docker exec <container_id> or name bash			-> to run bash commands from inside a running container

        
Dockerfile commands
---------------------
	# syntax parser directive	:  instructs the Docker builder what syntax to use when parsing the Dockerfile,
								   and allows older Docker versions with BuildKit enabled to upgrade the parser before starting the 
								   build. Parser directives must appear before any other comment, whitespace, or 
								   Dockerfile instruction in your Dockerfile, and should be the first line in Dockerfiles.
	
	docker/dockerfile:1			:  always points to the latest release of the version 1 syntax


	FROM openjdk:16-alpine3.13	:  tells Docker what base image we would like to use for our application. We’ll use the official 
								   Maven image with Java JDK that already has all the tools and packages that we need to run a Java 
								   application.
			(images can be inherited from other images, therefore we can use maven's image)
	
	
	docker build				: builds docker images from a Dockerfile and context
				

			(context is a set of files located in specified path or url)
			
	docker images				: view images		
 