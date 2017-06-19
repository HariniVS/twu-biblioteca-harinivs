package com.twu;

import com.twu.biblioteca.movie.Movie;

import java.util.LinkedHashMap;
import java.util.Map;

class Movies {

    private Map<Movie, Boolean> movies;

    Movies() {
        addMovies();
    }

    private void addMovies() {
        movies = new LinkedHashMap<>();
        movies.put(new Movie("Pulp Fiction", 1922, "Quentin Tarantino", 9), true);
        movies.put(new Movie("3 Idiots", 2011, "Raj Kumar", 9), true);
    }

    Map<Movie, Boolean> getMovies() {
        return movies;
    }
}
