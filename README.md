# 🎮 Games API - Spring Boot REST API

RESTful API built with Spring Boot for managing video games.
Deployed with Docker on Render and connected to PostgreSQL (Neon).

---

## 🚀 Live Demo

🌍 Base URL:
https://springboot-jpa-rest-api.onrender.com

You can test the API using:

GET /juegos
---

## 🛠 Technologies Used

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL (Neon)
* Maven
* Docker
* Render (Cloud Deployment)

---

## 📦 Features

* Create a game → `POST /juegos`
* Get all games → `GET /juegos`
* Get a game by ID → `GET /juegos/{id}`
* Update a game → `PUT /juegos/{id}`
* Delete a game → `DELETE /juegos/{id}`
* Search by title → `GET /juegos/query?tituloNombre={name}`

---

## 📌 Endpoints

```
GET     /juegos
GET     /juegos/{id}
POST    /juegos
PUT     /juegos/{id}
DELETE  /juegos/{id}
GET     /juegos/query?tituloNombre={name}
```

---

## 🗄 Database

This project uses PostgreSQL hosted on Neon.

Database connection is configured using environment variables:

```
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

---

## ⚙ Environment Variables

The following environment variables must be configured:

```
DB_URL=your_database_url
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
PORT=8080 (automatically assigned in Render)

These variables must be configured locally if you want to run the project outside Render.

In production (Render), they are configured in the service dashboard.

```

---

## 🐳 Docker


This project includes a Dockerfile for deployment.

It uses a multi-stage build:
- Maven image for compiling the project
- Lightweight JRE image for running the application

The application is deployed on Render using Docker.
```

---

## ▶ How to Run Locally

1. Clone the repository
2. Configure environment variables
3. Run:

```
./mvnw spring-boot:run
```

or

```
mvn spring-boot:run
```

---

## ☁ Deployment

The application is deployed on Render using Docker.

Render automatically:

* Builds the Docker image
* Assigns a dynamic PORT
* Injects environment variables
* Exposes the service publicly

---

## Author

Hyrum
