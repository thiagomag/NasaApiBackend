FROM eclipse-temurin:17-jdk-focal
MAINTAINER Thiago Magdalena
COPY target/nasaapibackend-0.0.1-SNAPSHOT.jar nasaapibackend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/nasaapibackend-0.0.1-SNAPSHOT.jar"]