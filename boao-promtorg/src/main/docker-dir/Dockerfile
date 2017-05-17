FROM java:8u111-jdk-alpine

ADD boao-promtorg.jar /app/boao-promtorg.jar

WORKDIR /app

EXPOSE 8081

ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "boao-promtorg.jar"]
