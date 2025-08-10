FROM openjdk:18.0-slim


# Copy the Spring Boot jar file into the container
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]