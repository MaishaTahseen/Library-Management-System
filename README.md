# Library Management System

This Java application simplifies library management tasks. It provides a user-friendly graphical user interface (GUI) for librarians, students, and administrators to perform essential library operations. The system uses a MySQL database for robust data management and introduces a Publisher entity for enhanced book tracking.

## Features

### Book Management

* **Add new books:** Add books with details like title, author, publisher, etc.
* **View existing books:** Browse the complete list of books in the library.
* **Edit book information:** Update book details such as title, author, or publisher.
* **Delete books:** Remove books from the library database.

### Student Management

* **Add new students:** Register students with their details.
* **View student information:** Access student records.
* **Edit student information:** Update student details.
* **Issue books to students:** Manage book issuance to registered students.
* **Return books:** Handle book returns and update records.

### Publisher Management (New Feature)

* **View publisher information:** Access publisher records.
* **Delete publishers:** Remove publishers from the database.

### Additional Functionalities

* **User-friendly GUI:** Improved and modernized interface for better usability.
* **MySQL Database:** Reliable and scalable database for efficient data management.
* **Bug Fixes:** Resolved known issues for smoother operation.
* **Code Cleanup:** Optimized and refactored code for better maintainability.

---

## Technologies Used

* **Programming Language:** Java
* **Database:** MySQL (via phpMyAdmin)
* **GUI Framework:** Java Swing
* **Version Control:** Git

---

## Installation and Setup

1. **Set Up MySQL Database:**

   * Install MySQL and phpMyAdmin.
   * Create a new database called **`library management system`**.
   * Import the provided SQL file (`library_management_system.sql`) into this database using phpMyAdmin.

2. **Configure Database Connection:**

   * Open the `DatabaseConnection.java` file.
   * Update the connection details (host, username, password, database name) to match your MySQL setup.

3. **Run the Application:**

   * Add the provided `.jar` file to your project or run it directly.
   * If using an IDE like IntelliJ IDEA or Eclipse, compile and run the project.
   * The GUI should launch, allowing you to manage books, students, and publishers.

---

## Maintainer

Maisha Tahseen - MaishaTahseen

---

## Download

[Download](#)

---

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.

---

## License

This project is open-source and available under the MIT License.


