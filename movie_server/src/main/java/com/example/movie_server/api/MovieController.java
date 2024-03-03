package com.example.movie_server.api;


import com.example.movie_server.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/list")
    public List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie("Zamanın Sınırında","2028","7.8"));
        movies.add(new Movie("İlk Göktürk","2027","9.8"));

        return movies;
    }
}
