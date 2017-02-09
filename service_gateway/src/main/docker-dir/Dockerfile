FROM java:8u111-jdk-alpine

ADD service_gateway.jar /app/service_gateway.jar

WORKDIR /app

EXPOSE 9090

ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "service_gateway.jar"]
