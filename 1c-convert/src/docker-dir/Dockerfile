FROM java:8u111-jdk-alpine

ADD 1c-convert.jar /app/1c-convert.jar

WORKDIR /app

EXPOSE 8081

ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "1c-convert.jar"]
