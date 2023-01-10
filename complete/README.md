# Sample app using JaCoCo

This adds the `jacoco-maven-plugin` to a sample Spring Boot 3 application.

## Requirements

**Java 17**

## Startup

```sh
./mvnw spring-boot:run
```

Sample request

```sh
curl localhost:8080
# Hello, World
```

## Test Coverage

The following command will run tests and generate test coverage files.

```sh
./mvnw clean jacoco:prepare-agent install jacoco:report
```

View the files in a browser

```sh
open target/site/jacoco/index.html
```

![JaCoCo Top-Level View](jacoco-1.png?raw=true "JaCoCo Top-Level View")

![JaCoCo Detailed View](jacoco-2.png?raw=true "JaCoCo Detailed View")

![JaCoCo Greeting Controller](jacoco-3.png?raw=true "JaCoCo Greeting Controller")
