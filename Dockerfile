# Base image
FROM openjdk:17
# Set the working directory
WORKDIR /app
#Copy the jar file from target directory to the container
COPY api-0.0.1-SNAPSHOT.jar api.jar
# Expose the application port
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java", "-jar", "api.jar"]