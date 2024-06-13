# Proyecto Spring, ecommer

![Arquitectura](path/to/your/architecture/image.png)

## Descripción

Este proyecto es una aplicación web basada en Spring Boot 3.3. La aplicación se encarga de gestionar productos. La base de datos utilizada es sql server y el proyecto está configurado para ser desplegado en un entorno Kubernetes.

## Estructura del Proyecto

- `src/main/java`: Contiene el código fuente de la aplicación.
- `src/main/resources`: Contiene los archivos de configuración de la aplicación.
- `build`: Contiene los scripts SQL y archivos YAML para la configuración y despliegue.

## Requisitos

- Java 17
- Spring Boot 3.3
- SqlServer
- Docker
- Kubernetes

## Instalación

### Clonar el repositorio

```bash
git clone https://github.com/anjamago/ecommertic
cd ecommertic
```

### Instalas base de datos 
```bash
docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=T8vL#3kX" -p 1433:1433 --name sqlserver -d mcr.microsoft.com/mssql/server:2022-latest

```

### Configuración de la Base de Datos
```bash
-- build/build.sql
docker cp build/build.sql sqlserver:/create_database.sql
docker exec -it sqlserver /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P T8vL#3kX! -i /create_database.sql
```

### Crear Imagen 
```bash
docker build -t springroductos .
```

### ejecutar aplicacion 
Para ejecutar la aplicación localmente, usa Maven.
```bash
./mvnw spring-boot:run
```


### Documentacion api postman
la documentacion fue generada bajo esquema openapi 3 
si no se cargan las variables de conexion 
para ambiente local 
``http://localhost:3157/swagger-ui/index.html``
ambiente Aplication manager
``https://apmdevtic.azure-api.net``