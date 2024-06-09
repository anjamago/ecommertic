FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/ecommerback-0.0.1-SNAPSHOT.jar ecommerback.jar
LABEL authors="andymartinez"
ENTRYPOINT ["java", "-jar","/ecommerback.jar"]