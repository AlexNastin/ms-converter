FROM java:8u111-jdk-alpine

ADD oe_service_registry.jar /app/oe_service_registry.jar

WORKDIR /app

EXPOSE 8761

ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "oe_service_registry.jar"]
