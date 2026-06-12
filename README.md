# ERP Management System

## Overview

ERP Management System is a web-based application developed using Spring Boot, MySQL, HTML, CSS, and JavaScript. The system helps manage users, products, suppliers, and inventory through a centralized dashboard.

## Features

### User Management

* User Registration
* User Login
* Role-Based Access (Admin/User)
* User Listing

### Product Management

* Add Products
* Update Products
* Delete Products
* View Product Details

### Supplier Management

* Add Suppliers
* Update Suppliers
* Delete Suppliers
* View Supplier Details

### Inventory Management

* Add Inventory Records
* Update Inventory Records
* Delete Inventory Records
* Inventory Tracking

### Dashboard

* Total Users Count
* Total Products Count
* Total Suppliers Count
* Total Inventory Count

## Technologies Used

### Backend

* Java
* Spring Boot
* Spring Data JPA
* REST API

### Frontend

* HTML
* CSS
* JavaScript

### Database

* MySQL

### Tools

* VS Code
* MySQL Workbench
* GitHub
* Maven

## Database Tables

* Users_ERP
* Products_ERP
* Suppliers_ERP
* Inventory_ERP
* Transactions_ERP
* Alerts_ERP

## Project Structure

src/main/resources/static/

* dashboard.html
* modules/users/
* modules/products/
* modules/suppliers/
* modules/inventory/
* assets/css/
* assets/js/

## How to Run

1. Clone the repository
2. Create the MySQL database
3. Update database credentials in application.properties
4. Run the project using:

mvn spring-boot:run

5. Open browser and visit:

http://localhost:8080/modules/users/login.html

## Future Enhancements

* Sales Management
* Purchase Orders
* Report Generation
* Email Notifications
* Advanced Analytics Dashboard

## Author

Srii

ERP Management System developed as a Full Stack Web Development Project using Spring Boot and MySQL.
