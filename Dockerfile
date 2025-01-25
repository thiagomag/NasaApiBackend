FROM eclipse-temurin:17-jdk-focal
LABEL maintainer="Thiago Magdalena"
WORKDIR /app
COPY target/nasaapibackend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]