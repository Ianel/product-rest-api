# PRODUCT REST API

This is a RESTful API built with Spring Boot and MongoDB. It allows you to perform CRUD operations on products.

## Installation

-   Clone the repository: `git clone https://github.com/Ianel/product-rest-api.git`
-   Open the project with `Visual Studio Code`
-   Install the required extensions for Java in VS Code
-   Install MongoDB and MongoDB Compass on your system
-   Run in the terminal: `./mvnw spring-boot:run` or use VS Code built in features

## Product Schema

```ts
Product {
    id: string;
    name: string;
    price: double;
    description: string;
}
```
