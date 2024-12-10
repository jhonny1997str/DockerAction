FROM openjdk:21

EXPOSE 8080

ADD target/docker-repo-java.jar docker-repo-java.jar

ENTRYPOINT ["java", "-jar", "/docker-repo-java.jar"]
