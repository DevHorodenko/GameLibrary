# Game Library API

A RESTful API for managing a personal game library, built with Spring Boot, Spring Data JPA, and PostgreSQL.

## Features

- Add games
- Store game details: title, genre, platform, release date, developer, publisher, description, cover image, ratings, completion status, favorite status, notes, and playtime
- API documentation with Swagger UI
- Basic authentication with Spring Security

## Technologies

- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- PostgreSQL
- Lombok
- Swagger (springdoc-openapi)

## Getting Started

### Prerequisites

- Java 17+
- Maven
- PostgreSQL

### Setup

1. **Clone the repository:**

   ```
   git clone https://github.com/DevHorodenko/GameLibrary.git
   ```

2. **Configure the database:**
   Edit `src/main/resources/application.properties` with your PostgreSQL credentials:

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/gamelibrary
   spring.datasource.username=your_db_user
   spring.datasource.password=your_db_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Set authentication credentials (optional):**

   ```
   spring.security.user.name=admin
   spring.security.user.password=admin
   ```

4. **Build and run the project:**

   ```
   mvn spring-boot:run
   ```

5. **Access Swagger UI:**
   - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
   - [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## API Endpoints

- `POST /game/create` — Add a new game

## Authentication

All endpoints require HTTP Basic authentication.  
Use the credentials defined in `application.properties`.

## License

This project is licensed under the MIT License.

