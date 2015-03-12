# Microservice Archetype B

Microservice archetype with Spring Boot, Scala, Akka and Gradle.

Project contains:
- Easy to test Akka system with a sample actor
- Spray-based RESTful API
- Actor and API sample tests
- View include
- Hibernate based datasource
- Logback-SLF4J logging

# API structure

```
TODO
```

# Build & Run

To build & run:
```
./gradlew build
```

Or use SBT..

Start up the sbt console using `sbt`
Run the Spring boot main program using `runMain com.hppoc.sbakka.SampleWebApplication`


And then run JAR as usual, something like this:

Unix
```
nohup java -jar build/libs/springboot-akka-microservice-0.1.0.jar 1>/dev/null 2>&1 &
```
Windows
```
java -jar build/libs/springboot-akka-microservice-0.1.0.jar 1>/dev/null
```

A url listing the hotels is at [http://localhost:8080/hotels](http://localhost:8080/hotels)


# Pending Points

1-Include full supoprt of Akka.

2-Implementation of the Tell Actor Design Pattern.

3-Separation of the View from the MS.