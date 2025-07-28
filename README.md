# NasaApiBackend

Program to access nasa api and transforming the response into an object.

Dependencies used in this project:

~~~
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-ui</artifactId>
            <version>1.6.6</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
~~~

To run in docker 

~~~
docker run --name nasa-api-backend -e API_KEY={API_KEY} -p 8080:8080 nasa-api-backend:latest
~~~

docker-compose -f docker-compose.yml -f docker-compose.windows.yml build --no-cache

docker-compose -f docker-compose.yml -f docker-compose.windows.yml up -d