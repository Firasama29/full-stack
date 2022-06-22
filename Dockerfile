FROM openjdk:11

RUN mkdir /app
COPY ./target/classes/Main.class /app

CMD java src/main/java/Main.java