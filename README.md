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
