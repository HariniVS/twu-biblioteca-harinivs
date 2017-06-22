package com.twu.biblioteca.movie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnMovieName() {
        String expectedMovieName = "Pulp Fiction";
        Movie movie = new Movie("Pulp Fiction", 1995, "Quentin Tarantino", 9);

        assertEquals(expectedMovieName, movie.getName());
    }

    @Test
    public void shouldReturnYear() {
        int expectedYear = 1995;
        Movie movie = new Movie("Pulp Fiction", 1995, "Quentin Tarantino", 9);

        assertEquals(expectedYear, movie.getYear());
    }

    @Test
    public void shouldReturnDirector() {
        String expectedDirectorName = "Quentin Tarantino";
        Movie movie = new Movie("Pulp Fiction", 1922, "Quentin Tarantino", 9);

        assertEquals(expectedDirectorName, movie.getDirector());
    }

    @Test
    public void shouldReturnRating() {
        int expectedRating = 9;
        Movie movie = new Movie("Pulp Fiction", 1922, "Quentin Tarantino", 9);

        assertEquals(expectedRating, movie.getRating());
    }
}
