# Fipe

This is the README file for the `fipe` project.

## Description

The `fipe` project is a software api that gets the latest and more accurate fipe price cars information. It provides functionality to add, update, and delete fipe records, as well as view cars details.

## Stack

**Back-end:** Java 17, Spring 3.2.5, h2 database

1. Java 17: https://www.oracle.com/br/java/technologies/downloads/
2. Spring: https://spring.io/projects/spring-boot
3. H2 database: https://h2database.com/html/main.html

## Local deploy

To install and run the `fipe` project, follow these steps:

1. Clone the repository: `git clone https://github.com/LuizCampedelli/employeemanager.git`
2. Navigate to the project directory: `cd fipe`
3. If you are using VSCode, type: `code .`, than install Extension Pack for Java, in the left panel click in Run and Debug.
4. If you are in Intellij IDEA, just hit the play green button.

## Usage
```
Once the api is running, you can access it by opening Insominia or using HTTPie in terminal.
To use Insominia, download it from: https://insomnia.rest/
To use HTTPie, download it from: https://httpie.io/cli
```

### Using Httpie

#### Return all employees

```http
  http :8080/api/categorias
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `GET` | Return all cars categories|

#### Add an employee

```http
  http POST :8080/employee/add < data.json
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `POST`      | Add employee using parameters from data.json |

#### Update an employee

```http
  http :8080/employee/update < data.json
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `PUT` | Update employee with changed parameters from data.json |

#### Delete an employee

```http
  http DELETE :8080/employee/delete/{id}
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `DELETE` | Delete employee by id |

#### Export employees to a file.

```http
  http :8080/employee/export
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `GET` | Export all employees to an file named employee.json to the root folder |

### Using Insominia

#### Return all employees

```http
  http://localhost/employee/all
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `GET` | Return all employees|

#### Add an employee

```http
  http://localhost/employee/add < data.json
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `POST`      | Add employee using parameters from data.json |

#### Update an employee

```http
  http://localhost/update < data.json
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `PUT` | Update employee with changed parameters from data.json |

#### Delete an employee

```http
 http://localhost/employee/delete/{id}
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `DELETE` | Delete employee by id |

#### Export employees to a file.

```http
  http://localhost/employee/export
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `GET` | Export all employees to an file named employee.json to the root folder |


## Contributing

If you would like to contribute to the `employeemanager` project, please follow these guidelines:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Make your changes and commit them: `git commit -m "Add your commit message"`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
