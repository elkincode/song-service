FROM openjdk:17
ARG JAR_FILE=./build/libs/song-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} song-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","song-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
