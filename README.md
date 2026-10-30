# Employee Management System

## Project Overview
The Employee Management System is a Java-based console application developed using Core Java, JDBC, and MySQL. It helps manage employee records through basic database operations.

## Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL
- Maven

## Features
- **Insert Employee:** Add new employee details.
- **View Employees:** Display all employee records.
- **Update Employee:** Modify existing employee details.
- **Delete Employee:** Remove employee records using employee ID.

## Employee Details
The application manages the following information:
- Employee ID
- Employee Name
- Employee Salary
- Employee City

## Project Structure
```text
Employee-Management-System/
├── src/
│   └── main/
│       └── java/
│           ├── com/
│           │   ├── dao/
│           │   │   └── DataAcces.java
│           │   ├── dto/
│           │   │   └── Employee.java
│           │   ├── dbutil/
│           │   │   └── DBUtil.java
│           │   └── emss/
│           │       └── Manage.java
├── pom.xml
└── README.md
```


## Learning Outcomes
- Understanding Core Java concepts.
- Working with JDBC connectivity.
- Executing SQL queries using PreparedStatement.
- Implementing CRUD operations.
- Connecting Java applications with MySQL databases.
