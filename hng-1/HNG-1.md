# HNG-1 

This is a demo API built with **Spring Boot** as part of the **HNG Assignment - Backend Track**. The API provides a simple endpoint (`/get`) that returns basic information such as an email, a GitHub URL and the current date-time.

## Features

- Returns a JSON response with:
    - **Email**
    - **GitHub URL**
    - **Current Date-Time**

## Prerequisites

Ensure you have the following installed:

- **Java 17+**
- **Maven**
- **Git**
- **Postman** (Optional, for testing)

## Setup and Running the Application

### 1. Clone the Repository

```sh
$ git clone https://github.com/your-username/hng-docs.git
$ cd hng-docs
```

### 2. Build the Project

Since this is a **modular** Spring Boot application, ensure that all required dependencies are installed:

```sh
$ mvn clean install
```

### 3. Run the Application

Start the Spring Boot application using:

```sh
$ mvn spring-boot:run
```

The server will start on [**http://localhost:8080**](http://localhost:8080) by default.

## API Endpoints

### GET `/get`

Returns a JSON response with email, GitHub URL, and current date-time.

#### Example Request

```sh
GET http://localhost:8080/get
```

#### Example Response

```json
{
  "email": "your-email@example.com",
  "github": "https://github.com/your-username",
  "datetime": "2025-01-29T12:34:56Z"
}
```

## Deployment

To build a JAR file for deployment, run:

```sh
$ mvn package
```

The JAR file will be available in the `target` directory.

To run the JAR file:

```sh
$ java -jar target/hng-1-1.0.0.jar
```


## Contribution

Feel free to fork this repository and submit a pull request if you would like to contribute!

- For more info [hng-java-developers](https://hng.tech/hire/java-developers)

## License

This project is open-source and available under the **MIT License**.

