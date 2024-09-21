
# Company Management System with Java Swing

A desktop-based application built with **Java Swing** for managing company resources, including Employees, Customers, and Orders. The application uses **SQLite** as the database source, providing an efficient solution for small- to medium-sized businesses.

## Features

- **Employee Management**: Add, edit, and delete employee information.
- **Customer Management**: Maintain customer records with CRUD (Create, Read, Update, Delete) operations.
- **Order Management**: Manage customer orders, view order history, and track order details.
- **Database**: SQLite database to store and retrieve all company data securely.


## Installation

To run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/MohamedSci/Company-Management-with-Java.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Company-Management-System-with-Java
   ```

3. Build the project using a Java IDE like **IntelliJ IDEA** or **Eclipse**.

4. Ensure you have **SQLite** installed or use the embedded SQLite database provided in the project.

## Database Setup

The application uses an **SQLite** database named `company.db`. The database structure includes the following tables:

- **Employees**: Stores information such as employee ID, name, position, and department.
- **Customers**: Stores customer details including customer ID, name, contact information.
- **Orders**: Stores order information like order ID, customer, date, and status.

The database file (`company.db`) is included in the root directory of the project. You can also modify the database by using any SQLite management tool.

## Usage

1. Launch the application.
2. Use the navigation menu to switch between Employee, Customer, and Order management modules.
3. Perform CRUD operations using the provided forms in each module.

### Prerequisites

- **Java Development Kit (JDK)** 8 or above.
- **SQLite JDBC Driver** (included in the project).

## Libraries Used

- [SQLite JDBC Driver](https://github.com/xerial/sqlite-jdbc) for connecting to the SQLite database.
- Java Swing for the GUI.

## How to Contribute

If you would like to contribute to this project, follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, feel free to contact:

- **Your Name**: muhammedsaidsyed215@gmail.com
- **GitHub**: https://github.com/MohamedSci
