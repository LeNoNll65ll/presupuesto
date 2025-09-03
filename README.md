# Presupuesto

Backend de ejemplo para gestión presupuestaria SAF usando Spring Boot 3.3 y JDK 21.

## Requisitos
- JDK 21
- Maven 3.9+
- MariaDB 10.6+

## Ejecución
```
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

El perfil `dev` utiliza una base MariaDB local y carga datos mínimos mediante Flyway.
