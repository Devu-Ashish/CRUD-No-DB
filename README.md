# CRUD Spring Boot Application without Database
This is a simple Spring Boot application demonstrating basic CRUD operations without a database.
# Table of Contents
1. Installation
2. Usage
3. Project Details
# Installation
1. Clone the repository to your local machine:
   git clone https://github.com/Devu-Ashish/CRUD-No-DB.git
2. Go to the project directory:
   
   cd CRUD-No-DB
4. Build the project with Maven:
   
   mvn clean install
# Usage
Run the Spring Boot application:

  mvn spring-boot:run
Now, Visit http://localhost:8080 in your web browser to see the application in action.
Here are the available endpoints:
1. GET /users: Returns a list of all users.
2. POST /users: Adds a new user. The user details should be sent in the request body in JSON format.
3. PUT /users: Updates a user. The updated user details, including the ID, should be sent in the request body in JSON format.
4. DELETE /users/{id}: Deletes the user with the given ID.
# Project Details
This project does not use a database. Instead, it utilizes a service layer with a LinkedHashMap to store data in-memory. This makes it possible to perform all of the usual CRUD operations (create, read, update, delete) without needing to set up a database connection.

This approach allows us to focus on the core functionality of a Spring Boot application and demonstrate Spring Boot skills effectively in a quick interview setting. The service layer demonstrates the use of Spring's dependency injection, and the controller demonstrates how to define RESTful endpoints.

Please note that this approach is meant for demonstration purposes and is not suitable for persisting data across multiple runs of the application or in a production environment. For a more realistic application, you would want to connect to a real database and use Spring Data JPA or a similar technology to perform CRUD operations.







