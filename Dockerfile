# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
COPY out/artifacts/SnakeAndLadder_jar/SnakeAndLadder.jar /SnakeAndLadder.jar
CMD ["java", "-jar" ,"./SnakeAndLadder.jar"]
