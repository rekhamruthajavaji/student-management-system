# 🎓 Console-Based Student Management System

## 📌 Project Description
The Console-Based Student Management System is a menu-driven Java application developed using JDBC and MySQL. It allows users to manage student records efficiently by performing CRUD operations, searching records, generating reports, and displaying top-performing students based on CGPA.

---

## 🚀 Features
- Add New Student Records
- View All Student Records
- Search Student by ID
- Search Student by Name
- Update Student Details
- Delete Student Records
- Display Top 5 Students Based on CGPA
- Generate Branch-wise Student Reports
- Proper Exception Handling

---

## 🛠 Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse IDE
- Git & GitHub

---

## 📂 Project Structure

```
StudentManagementSystem
│
├── src
│   ├── Student.java
│   ├── StudentDAO.java
│   ├── DBConnection.java
│   └── StudentManagement.java
│
└── README.md
```

---

## 🗄 Database Setup

### Create Database
```sql
CREATE DATABASE studentdb;
USE studentdb;
```

### Create Table
```sql
CREATE TABLE student(
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    branch VARCHAR(30),
    year INT,
    email VARCHAR(50),
    cgpa DOUBLE
);
```

---

## ▶️ How to Run the Project

1. Install MySQL and Eclipse IDE.
2. Create the database and table using the SQL queries above.
3. Add MySQL Connector JAR to the project build path.
4. Configure database credentials in `DBConnection.java`.
5. Run `StudentManagement.java`.
6. Use the menu options to perform operations.

---

## 📋 Menu Options

1. Add Student
2. View Students
3. Search By ID
4. Search By Name
5. Update Student
6. Delete Student
7. Top 5 Students
8. Branch Report
9. Exit

---

## 📚 Concepts Covered
- JDBC Architecture
- DriverManager
- Connection
- Statement
- PreparedStatement
- ResultSet
- CRUD Operations
- Exception Handling
- Encapsulation
- SQL Queries
- Menu-Driven Programming

---

## 👩‍💻 Author
**Rekhamrutha**

B.E. Computer Science Engineering  
Java Full Stack Developer (Fresher)

---

## 📌 Future Enhancements
- Admin Login Authentication
- Input Validation
- Connection Pooling (HikariCP)
- Export Reports to Excel/PDF
- GUI using Java Swing or JavaFX
- Logging Framework