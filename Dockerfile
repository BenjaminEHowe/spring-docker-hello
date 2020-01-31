FROM openjdk:11-jre
EXPOSE 8080
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} spring-docker-hello.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "spring-docker-hello.jar"]
