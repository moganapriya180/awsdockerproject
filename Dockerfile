FROM eclipse-temurin:17
COPY target/awsdockerproject.jar awsdockerproject.jar 
CMD [ "java", "-jar","awsdockerproject.jar"]