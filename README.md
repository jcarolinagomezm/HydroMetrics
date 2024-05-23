

# Composicion del proyecto

## Parte Back-end
El backen se compone de 2 servicios main-back y data-processer 

### hydrometrics-back(main-back)
Este servicio se encarga de comunicarse directamente con el front, sindo intermediario entre la base de datos y el front de tal maner que aqui se realizan ciertas gestiones de Alertas, Usuarios y Consulta de datos para reportes

### data-processor
Este servicio tiene la finalidad de evitar que se bloquee el main-back, ya que a la hora de guardar y escribir grandes cantidades de datos se le delega esta tarea a este servicio y mediante la programacion reactiva y comunicacion por endpoints, este recibe los datos en tipo json mediante una solicitud HTTP, procesando los datos y retornando una respuesta cuando finaliza de procesar los datos. Con la ventaja de poder seguir realizando acciones con el main-back y no se bloquee por estos datos que se guardan y analizan.

## Base de Datos
La base de datos esta basada en MySQL pero se empleo un enfoque basado en el manejo mediante un ORM, en este preciso caso JPA (Java Persistence API), buscando no ser dependiente de el motor de base de datos y que facil de cambiar si fuera requerido.

### Composicion
#### Tablas
- weather_data > auditada
- alert
- user > auditada
- station
- prediction

## Parte Front-end

### hydrometric-front
Se empleo el framework Angular en conjunto con una plantilla de adminLTE basado en sus ultimas versiones. Desde alli podemos encontrar un sistema de inicio de sesion. Al acceder podemos encontrar todas las funciones disponibles segun el perfil que tenga el usuario que ingreso.

# Ejecucion del proyecto en conjunto

## Pre-requisitos
- Tener instalado docker

## Pasos para la ejecucion
1. ubicarse en la carpeta raiz del repositorio
2. abrir una terminal
3. ejecutar el proyecto con el comando :```docker-compose up -d```
4. revisar que el main-back y el data-processor esten ejecutados correctamente ya que tardan en poderce conectar con la base de datos cuando recien se ejecuta todo el proyecto.

# NOTA
Por defecto el proyecto carga unos pequeños datos de pruebas si desea cambiar esto dirijase a el archivo application.properties de hydrometics-back y cambie a false los campos de 

- init.data.enabled=true 
- init.users.enabled=true
- init.stations.enabled=true



## Acceder a la documentación Endpoints
- URL: [Documentacion API (Swagger)](http://localhost:8080/swagger-ui/index.html)