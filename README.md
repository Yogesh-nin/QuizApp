# Quiz App - Java Spring Boot

Welcome to the **Quiz App**, a Java Spring Boot project designed to provide a simple yet flexible platform for creating, managing, and participating in quizzes. The application exposes RESTful APIs to interact with the quiz system, making it suitable for integration with various frontend frameworks.

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Quiz Creation**: Easily create quizzes with multiple questions and answers.
- **Question Management**: Add, update, and delete questions in the quiz.
- **User Participation**: Users can take quizzes and submit their answers.
- **Scoring System**: Automated scoring of quizzes based on user responses.
- **RESTful APIs**: Exposes a set of APIs for quiz management and participation.

## Tech Stack
- **Java**: Version 11+
- **Spring Boot**: Version 2.7+
  - Spring Web
  - Spring Data JPA
  - Spring Security (Optional)
- **Hibernate**: ORM for database management
- **H2 Database**: In-memory database for testing and development
- **MySQL/PostgreSQL**: For production environment
- **Lombok**: To reduce boilerplate code

## Project Structure
The project follows a standard Spring Boot structure:
src/
├── main/
│ ├── java/
│ │ └── com.example.quizapp/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ └── QuizAppApplication.java
│ └── resources/
│ ├── application.properties
│ └── data.sql
└── test/


## Getting Started
### Prerequisites
- Java 11 or higher
- Maven 3.6+
- MySQL/PostgreSQL (for production use)

### Setup
1. **Clone the repository**:
   ```
   git clone https://github.com/YogeshChandra/quiz-app.git
   cd quiz-app
2. **Configure the database:**
    - Edit the src/main/resources/application.properties file to configure your database connection.
    - Example for MySQL:
      ```spring.datasource.url=jdbc:mysql://localhost:3306/quizapp
      spring.datasource.username=root
      spring.datasource.password=yourpassword
      spring.jpa.hibernate.ddl-auto=update```
3. ***Run the application:***
   ```mvn spring-boot:run```

## API Endpoints
The following are the key API endpoints available in the application:
