FROM java:8u111-jdk-alpine

ADD config_server.jar /app/config_server.jar

WORKDIR /app

EXPOSE 8888

ENTRYPOINT ["java", "-Dspring.profiles.active=git", "-jar", "config_server.jar"]
