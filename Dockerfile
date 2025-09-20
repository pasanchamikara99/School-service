
FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/SchoolService-3.0.2.war /app/SchoolService-3.0.2.war

EXPOSE 8081

CMD ["java", "-jar", "/app/SchoolService-3.0.2.war"]
