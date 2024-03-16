# Debate Event Registration System

## Overview:
This project is a web application designed for managing registrations for a Debate event during a college fest. It allows users to insert, update, delete, and view student details based on their courses. The application also includes a security layer with roles: USER and ADMIN.

## Setup Instructions:
1. Clone the repository to your local machine.
2. Import the project into your preferred IDE.
3. Ensure you have Maven installed and configured.
4. Configure your database settings in `application.properties`.
5. Run the project using the embedded Tomcat server.

## Dependencies:
- Spring Framework
- Spring MVC
- Hibernate ORM
- Spring Security

## How to Run:
1. Navigate to the project directory.
2. Run `mvn clean install` to build the project.
3. Deploy the WAR file to your Tomcat server.
4. Access the application through the browser.

## Usage:
- Upon accessing the application, users will be prompted to log in.
- Users with ADMIN role can perform all CRUD operations.
- Users with USER role can only view and save details.

## Access:
http://localhost:8080/StudentManagement/login

