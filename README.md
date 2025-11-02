# API REST para Gestión de Empleados con Spring Boot y Thymeleaf (CRUD)

Este proyecto implementa una **API REST** completa para la gestión de empleados, desarrollada con Spring Boot. Incluye una visualización simple en el frontend utilizando **Thymeleaf**, demostrando una solución de pila completa (Full-Stack básico).

---

## Tecnologías Utilizadas (Tech Stack)

| Categoría | Tecnología | Versión Clave |
| :--- | :--- | :--- |
| **Backend** | Spring Boot | 3.x |
| **Lenguaje** | Java | 24 (JDK 24.0.1) |
| **Persistencia** | Spring Data JPA | |
| **Base de Datos** | H2 Database | En memoria |
| **Frontend** | Thymeleaf | Plantillas HTML |
| **Construcción** | Maven | |
| **Otros** | Lombok | Simplificación de código |

---

## Estructura del Proyecto

El proyecto sigue una arquitectura de capas bien definida (Controlador, Servicio, Repositorio), garantizando la separación de responsabilidades:

* **`model`**: Define la entidad `Employee.java`.
* **`repository`**: Interfaz `EmployeeRepository` (Spring Data JPA) para interactuar con la BD.
* **`service`**: Lógica de negocio CRUD (`EmployeeService`).
* **`controller`**:
    * `EmployeeController`: Maneja las peticiones **REST** (`/api/v1/empleados`).
    * `EmployeeWebController`: Maneja las peticiones **Web** (`/`) para el frontend con Thymeleaf.

---

## Endpoints de la API REST

La API se expone en la URL base: `http://localhost:8080/api/v1/empleados`.

| Método | URL | Descripción | Código de Estado Típico |
| :--- | :--- | :--- | :--- |
| **POST** | `/` | Crea un nuevo empleado. | `200 OK` (o `201 Created`) |
| **GET** | `/{id}` | Obtiene los detalles de un empleado por ID. | `200 OK` (Si existe) / `404 Not Found` (Si no existe) |
| **PUT** | `/{id}` | Actualiza un empleado existente. | `200 OK` |
| **DELETE** | `/{id}` | Elimina un empleado por ID. | `200 OK` (o `204 No Content`) |

---

## Evidencia Visual y Pruebas (CRUD y Frontend)

Las siguientes capturas demuestran la funcionalidad completa del proyecto:

### 1. Creación y Lectura (POST y GET)

Se crea un empleado (`POST` exitoso) y luego se lee el registro (`GET` exitoso), demostrando la funcionalidad básica de la API.

![POST Exitoso](docs\assets\post.png)
![GET Exitoso](docs\assets\get.png)


### 2. Actualización y Eliminación (PUT y DELETE)

Se actualiza un campo del empleado (`PUT`) y luego se elimina el registro (`DELETE`), verificando que al intentar leerlo (`GET`), la API devuelve `404 Not Found`.

![PUT Exitoso](docs\assets\put.png)
![GET 404 NOT FOUND](docs\assets\geterror.png)

### 3. Visualización Frontend (Thymeleaf)

La vista web demuestra que el backend (`EmployeeService.getAllEmployees()`) está siendo consumido por el frontend (`employees.html`), completando el ciclo Full-Stack.

![TABLA THYMELEAF](docs\assets\tablaThymeleaf.png)

### 4. Persistencia en Base de Datos (H2 Console)

Verificación directa en la base de datos (H2) de que los datos insertados a través de la API se persisten correctamente.

![H2 CONSOLE](docs\assets\h2Console.png)

---

## ⚙️ Cómo Instalar y Ejecutar Localmente

1.  **Requisitos:** Tener instalado Java JDK 24 (o superior) y Maven.
2.  **Clonar el repositorio:** `git clone [TU URL DE GITHUB]`
3.  **Ejecutar la aplicación:** Abrir la terminal en la raíz del proyecto y usar el Maven Wrapper:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  **Acceder al Frontend:** Abre tu navegador y navega a `http://localhost:8080/`
5.  **Probar el API:** Utiliza Postman para probar los demás endpoints REST en la URL `http://localhost:8080/api/v1/empleados`.