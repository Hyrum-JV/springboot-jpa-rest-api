# Games API - Spring Boot REST API

REST API built with **Spring Boot**, **JPA**, **Hibernate**, and **H2 Database**.

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## Features

- Create a game (POST /juegos)
- Get all games (GET /juegos)
- Get a game by ID (GET /juegos/{id})
- Update a game (PUT /juegos/{id})
- Delete a game (DELETE /juegos/{id})
- Search by title (GET /juegos/query?tituloNombre=...)

## Endpoints

GET /juegos  
GET /juegos/{id}  
POST /juegos  
PUT /juegos/{id}  
DELETE /juegos/{id}  
GET  /juegos/query?tituloNombre={name} Search games by title 

## Database

- In-memory **H2 database**
- H2 Console available at: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (empty)

> 💡 All data is temporary and will be lost when the application stops. You can test creating, updating, and deleting games while the app is running.

## How to Run

1. Clone the repository
2. Open in your IDE
3. Run `GamesApiApplication.java`
4. Access endpoints using Postman, browser, or any REST client

## Author

**Hyrum** 
