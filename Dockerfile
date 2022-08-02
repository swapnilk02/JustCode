FROM openjdk:8-jdk-alpine
ADD target/SpringBootMySQLDocker.jar SpringBootMySQLDocker.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","SpringBootMySQLDocker.jar"]