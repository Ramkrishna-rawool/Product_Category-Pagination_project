# MyCrudeOperationWith_Pagination
Category-Product Management System
A comprehensive Spring Boot application that provides RESTful APIs for managing categories and products with a one-to-many relationship. The application is designed to perform CRUD operations while ensuring server-side pagination and category-product association.-
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Features
1. Category Management
Create Category: Add a new category using a POST API.
View All Categories: Fetch paginated categories with a GET API.
View Category by ID: Retrieve specific category details.
Update Category: Modify an existing category by its ID.
Delete Category: Remove a category by its ID.

2. Product Management
Create Product: Add a new product using a POST API.
View All Products: Fetch paginated products with a GET API.
View Product by ID: Retrieve specific product details with its associated category.
Update Product: Modify an existing product by its ID.
Delete Product: Remove a product by its ID.

3. Category-Product Relationship
Implements a one-to-many relationship between categories and products (one category can have multiple products).
Product details include respective category information when fetched.

4. Pagination
Supports server-side pagination for efficient data retrieval in both categories and products.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


## API Endpoints

### Category APIs:

| Method | Endpoint                          | Description                    |
|--------|-----------------------------------|--------------------------------|
| GET    | `/api/categories?page={page}`     | Fetch all categories (paginated). |
| POST   | `/api/categories`                 | Create a new category.         |
| GET    | `/api/categories/{id}`            | Fetch a category by ID.        |
| PUT    | `/api/categories/{id}`            | Update a category by ID.       |
| DELETE | `/api/categories/{id}`            | Delete a category by ID.       |

### Product APIs:

| Method | Endpoint                          | Description                    |
|--------|-----------------------------------|--------------------------------|
| GET    | `/api/products?page={page}`       | Fetch all products (paginated). |
| POST   | `/api/products`                   | Create a new product.          |
| GET    | `/api/products/{id}`              | Fetch a product by ID (with category). |
| PUT    | `/api/products/{id}`              | Update a product by ID.        |
| DELETE | `/api/products/{id}`              | Delete a product by ID.        |


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Technologies Used
Backend Framework: Spring Boot
Database: Relational Database (Oracle Sql Developer)
ORM: JPA & Hibernate
Pagination: Server-side pagination using Spring Data JPA
Configuration: Annotation-based configuration (No XML)

