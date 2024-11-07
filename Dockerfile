# Usa una imagen base de OpenJDK 21
FROM openjdk:21

# Expone el puerto 8080
EXPOSE 8080

# Añade el archivo JAR de la aplicación al contenedor
ADD target/docker-repo-java.jar docker-repo-java.jar

# Define el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/docker-repo-java.jar"]
