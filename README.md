# Microservice Movie Project

I aimed to create a communication infrastructure by creating basic level Spring microservices and connecting them to each other. 

movie_server returns data as in-memory. movie_client receives data from movie_server and returns it to the user.
movie_eureka_server brings these microservices together on a server.

## Dependencies
- Eureka Server
- Thymeleaf
- Spring Cloud

## movie_server

The `movie_server` microservice provides a REST API to get a list of movies.

#### API Endpoints

- `GET /list`: Returns a list of movies.

#### Example Response

```json
[
    {
        "title": "Zamanın Sınırında",
        "year": "2028",
        "rating": "7.8"
    },
    {
        "title": "İlk Göktürk",
        "year": "2027",
        "rating": "9.8"
    }
]
```
#### Run

```sh
cd movie_server
mvn spring-boot:run
```

## movie_client
Consumes the `movie_server` API and displays the movie information on a web page.

#### Endpoint
- `GET /`: Fetches movies from `movie_server` and displays them.

#### Run
```sh
cd movie_client
mvn spring-boot:run
```

### Example Usage
" - Start movie_server.
2 - Start movie_client.
3 - Open http://localhost:8080/ to view the movies.

### Building the Project
```sh
mvn clean install
```

####License
This project is licensed under the MIT License.

