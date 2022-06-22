FROM openjdk:11

RUN mkdir /app
ADD target/*.jar /app
WORKDIR /app
CMD java Main