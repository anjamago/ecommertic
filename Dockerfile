FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 3157
ENTRYPOINT ["java","-jar","/app.jar"]
