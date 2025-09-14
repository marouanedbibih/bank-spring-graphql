# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:21-jdk-alpine 

# Set the working directory
WORKDIR /app

# Copy the built jar file from the target directory
COPY target/*.jar app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
