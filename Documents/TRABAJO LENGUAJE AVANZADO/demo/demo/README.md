# Spring Boot API - Evaluación RESTful

Este proyecto contiene una API RESTful desarrollada con Spring Boot como parte de una evaluación. Incluye 5 ejercicios prácticos que implementan endpoints básicos, CRUD, internacionalización, reactividad con WebFlux y pruebas unitarias.

## Requisitos
Para ejecutar esta API, necesitas tener instalado:
- **Java 17** o superior (JDK).
- **Maven** (para gestionar dependencias).
- Un IDE como **IntelliJ IDEA** (opcional, pero recomendado) o una terminal para ejecutar comandos.

## Instalación
1. **Clona el repositorio**:
   Abre una terminal y ejecuta:
   ```bash
   git clone https://github.com/SteveJobssss/Spring_Boot.git

Esto descargará el proyecto a tu computadora.

2. **Navega al directorio del proyecto:**
    ```bash
   cd Spring_Boot
3. **Descarga las dependencias: Ejecuta este comando para instalar las librerías necesarias:**
    ```bash
    mvn clean install -DskipTests

Nota: -DskipTests omite las pruebas unitarias durante la instalación inicial.

**Ejecución**

**Inicia la aplicación:**

- Si usas IntelliJ:
    - Abre el proyecto en IntelliJ.
    - Busca src/main/java/com/tuempresa/tuaapi/Application.java.
    - Haz clic derecho → Run 'Application.main()'.
    - Si usas la terminal:
    ```bash
    mvn spring-boot:run
  
- La aplicación se ejecutará en http://localhost:8080.


- **Prueba los endpoints:**

Usa un navegador o una herramienta como Postman para probar los siguientes endpoints:

- **Ejercicio 1: Endpoint simple**
    ```bash
    GET http://localhost:8080/api/saludo

Respuesta: "¡Hola, API RESTful!"

- **Ejercicio 2: CRUD de productos**

- Crear: POST http://localhost:8080/api/productos (con JSON como {"nombre": "Laptop", "precio": 1200.0})
- Listar: GET http://localhost:8080/api/productos
- Obtener por ID: GET http://localhost:8080/api/productos/{id}
- Actualizar: PUT http://localhost:8080/api/productos/{id}
- Eliminar: DELETE http://localhost:8080/api/productos/{id}

- **Ejercicio 3: Internacionalización**
- 
    ```bash
    GET http://localhost:8080/api/saludo?lang=en
Respuesta: "Hello, RESTful API in English!"

    GET http://localhost:8080/api/saludo?lang=es

Respuesta: "¡Hola, API RESTful en Español!"

- **Ejercicio 4: Endpoint reactivo**
    ```bash
    GET http://localhost:8080/api/productos-reactivos
  
Respuesta: Lista de productos en JSON (reactivo con WebFlux).

- **Ejercicio 5: Pruebas Las pruebas unitarias están en src/test/java/com/tuempresa/tuaapi/tests/ProductoControllerTest.java. Para ejecutarlas:**
    ```bash
    mvn test
  
**Notas:**

- Asegúrate de que el puerto 8080 esté libre.
- Si encuentras errores, verifica que Java y Maven estén configurados correctamente en tu sistema (usa java -version y mvn -version).

- **Autor**

SteveJobssss
Guarda el archivo:

Presiona Ctrl+S o haz clic en File → Save.
