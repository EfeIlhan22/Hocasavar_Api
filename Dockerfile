# Base image
FROM openjdk:17
# Set the working directory
WORKDIR /app
#Copy the jar file from target directory to the container
COPY Hocasavar_Api-0.0.1-SNAPSHOT.jar Hocasavas_Api.jar
# Expose the application port
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java", "-jar", "Hocasavas_Api.jar"]