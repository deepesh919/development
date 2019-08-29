FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/SpringBootWithDocker.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]