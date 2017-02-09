FROM java:8u111-jdk-alpine

ADD oe_config_server.jar /app/oe_config_server.jar

WORKDIR /app

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "oe_config_server.jar"]
