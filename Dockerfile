FROM openjdk:17-alpine
COPY /target/person-app-0.0.1-SNAPSHOT.jar person-app.jar
ENTRYPOINT ["java","-jar","person-app.jar"]