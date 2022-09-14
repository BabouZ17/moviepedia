package com.example.moviepedia.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements IMovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> listMovies() {
        return this.repository.findAll();
    };
}
