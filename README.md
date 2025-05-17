---

##  Employee Management with DB - README.md*

markdown
# Employee Management System (With Database)

This is a full-fledged **Spring Boot** application that manages employees using **MySQL Database** and **Spring Data JPA**. It performs all **CRUD** operations (Create, Read, Update, Delete).

## Features

- Add new employees
- View all employees
- View employee by ID
- Update employee details
- Delete employee

## Technologies Used

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Maven

## Getting Started

### Prerequisites

- Java JDK 17 or later
- Maven
- MySQL
- Spring Tool Suite / IntelliJ IDEA / Eclipse

### MySQL Setup

1. Start MySQL server
2. Create a database:

sql
CREATE DATABASE employee_db;
### Properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

### Run
mvn spring-boot:run
