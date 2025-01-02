# Synclet

Synclet is a Spring Boot application designed to simplify data management by syncing files from multiple sources effortlessly to your PC.

## Features

- User and Admin management
- Authentication and Authorization
- Data synchronization
- Responsive UI with Thymeleaf
- RESTful API

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- Maven
- MariaDB

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6.3 or higher
- MariaDB

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/renikita/synclet.git
    cd synclet
    ```

2. Configure the database in `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:mariadb://localhost:3306/Synclet_db?createDatabaseIfNotExist=true
    spring.datasource.username=root
    spring.datasource.password=root
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Build the project:
    ```sh
    mvn clean install
    ```

4. Run the application:
    ```sh
    mvn spring-boot:run
    ```

### Usage

- Access the application at `http://localhost:8080`
- Use the provided endpoints to manage users and admins

## Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Open a pull request

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

This is a temporary README file and will be updated as the project progresses.

![image](https://github.com/user-attachments/assets/b65f3d67-4a1c-4635-80ce-688391a06e82)


