package com.twu;

import com.twu.biblioteca.movie.Movie;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MoviesTest {

    @Test
    public void shouldReturnListOfMovies() {
        Movies movieRepository = new Movies();
        final Map<Movie, Boolean> moviesMap = movieRepository.getMovies();

        Set<Movie> expectedMovies = getExpectedMovies();
        final Set<Movie> movies = moviesMap.keySet();
        assertEquals(expectedMovies.toString(), movies.toString());
    }

    private Set<Movie> getExpectedMovies() {
        Map<Movie, Boolean> expectedMovies = new LinkedHashMap<>();
        expectedMovies.put(new Movie("Pulp Fiction", 1922, "Quentin Tarantino", 9), true);
        expectedMovies.put(new Movie("3 Idiots", 2011, "Raj Kumar", 9), true);
        return expectedMovies.keySet();
    }
}
