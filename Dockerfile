FROM openjdk:17-jdk-alpine3.14
ADD ./target/spring-mysql-0.0.1-SNAPSHOT.jar spring.jar
ENTRYPOINT ["java","-jar","spring.jar"]