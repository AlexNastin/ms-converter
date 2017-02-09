FROM java:8u111-jdk-alpine

ADD service_registry.jar /app/service_registry.jar

WORKDIR /app

EXPOSE 8761

ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "service_registry.jar"]
