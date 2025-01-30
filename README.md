# HNG-Docs

This repository is part of the **HNG Assignment - Backend Track** and contains multiple modules. Each module serves a distinct purpose within the application.

## Modules

### 1. Api to return basic information
- Handles the `/get` endpoint to return:
    - **Email**
    - **GitHub URL**
    - **Current Date-Time**
- See [Details Module README](hng-1/HNG-1.md) for more information.

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
The server will start on **http://localhost:8080** by default.

## Deployment
To build a JAR file for deployment, run:
```sh
$ mvn package
```
The JAR file will be available in the `target` directory.

To run the JAR file:
```sh
$ java -jar target/hng-docs-1.0.0.jar
```

## Contribution
Feel free to fork this repository and submit a pull request if you would like to contribute!
 
- For more info [hng-java-developers](https://hng.tech/hire/java-developers)


## License
This project is open-source and available under the **MIT License**.

