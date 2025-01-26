FROM eclipse-temurin:17-jdk-focal AS build

LABEL maintainer="Thiago Magdalena"

# Instala o Maven
RUN apt-get update && apt-get install -y maven

# Define o diretório de trabalho
WORKDIR /app

# Copia o pom.xml e as dependências para o container
COPY pom.xml .

# Baixa as dependências do Maven
RUN mvn dependency:go-offline

# Copia o código-fonte
COPY src /app/src

# Faz o build do projeto
RUN mvn clean package -DskipTests

# Agora, cria a imagem final (imagem para rodar a aplicação)
FROM eclipse-temurin:17-jdk-focal

LABEL maintainer="Thiago Magdalena"

WORKDIR /app

# Copia o JAR gerado no build para a nova imagem
COPY --from=build /app/target/nasaapibackend-0.0.1-SNAPSHOT.jar app.jar

# Expondo a porta
EXPOSE 8080

# Define o comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/app.jar"]