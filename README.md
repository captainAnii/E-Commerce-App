# E-commerce API

- This is an E-commerce API built using the Spring framework. The API provides endpoints to manage users, products, addresses, and orders for an e-commerce platform.
----
## Technologies Used

- Java
- Spring Boot
- MySQL
- Hibernate
- Maven
----
## Features

- User management (create, read, update, delete)
- Product management (create, read, update, delete)
- Address management (create, read, update, delete)
- Order management (create, read, update, delete)
----
## Getting Started
- To get started with this project, follow these steps:

1. Clone the repository:

  
 -  git clone https://github.com/your-username/ecommerce-api.git
 -  cd ecommerce-api

- Set up the MySQL database by creating a new database and configuring the database connection in src/main/resources/application.properties.

- Build and run the application using Maven:
- mvn spring-boot:run
- The API will be accessible at http://localhost:8080.
----
## API Endpoints
```
### User Endpoints
- GET /users: Get all users
- GET /users/{userId}: Get a user by ID
- POST /users: Create a new user
- PUT /users/{userId}: Update a user
- DELETE /users/{userId}: Delete a user
```
```
### Product Endpoints
- GET /products: Get all products
- GET /products/{productId}: Get a product by ID
- POST /products: Create a new product
- PUT /products/{productId}: Update a product
- DELETE /products/{productId}: Delete a product
```
```
### Address Endpoints
- GET /addresses: Get all addresses
- GET /addresses/{addressId}: Get an address by ID
- POST /addresses: Create a new address
- PUT /addresses/{addressId}: Update an address
- DELETE /addresses/{addressId}: Delete an address
```
```
### Order Endpoints
- GET /orders: Get all orders
- GET /orders/{orderId}: Get an order by ID
- POST /orders: Create a new order
- PUT /orders/{orderId}: Update an order
- DELETE /orders/{orderId}: Delete an order
```
----
## Contributing
- Contributions to this project are welcome! If you have any suggestions, improvements, or bug fixes, please open an issue or a pull request.
----
## License
- This project is licensed under the MIT License.
