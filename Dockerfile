FROM eclipse-temurin:17-jdk-focal AS build
LABEL maintainer="Thiago Magdalena"
RUN apt-get update && apt-get install -y maven
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src /app/src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-focal
LABEL maintainer="Thiago Magdalena"
WORKDIR /app
COPY --from=build /app/target/nasaapibackend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]