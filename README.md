# Documentación Breve
Este proyecto es una aplicación para gestionar solicitudes y crear jugadores. Está desarrollado con Spring Boot y utiliza una base de datos en memoria H2 para almacenamiento (temporalmente) . Además, incluye soporte para migraciones de base de datos con Flyway y utiliza Lombok para simplificar el código.

![image](https://github.com/user-attachments/assets/7d98266c-8a6d-4c18-9903-db257c44e062)

## Ejecución
Para ejecutar la aplicación  
.\gradlew bootRun

## Configuración del Proyecto
Plugins
El proyecto utiliza los siguientes plugins:  
java: Para soporte de Java.  
org.springframework.boot: Versión 3.4.4 para el framework Spring Boot.  
io.spring.dependency-management: Versión 1.1.7 para gestionar dependencias.  
Dependencias Principales  
Spring Boot Starter Data JPA: Para trabajar con JPA.  
Spring Boot Starter HATEOAS: Para construir APIs RESTful.  
Flyway Core: Para migraciones de base de datos.  
H2 Database: Base de datos en memoria para desarrollo y pruebas.  
Lombok: Para reducir el código repetitivo (anotaciones como @Getter, @Setter, etc.).  
