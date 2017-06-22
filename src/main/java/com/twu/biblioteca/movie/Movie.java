package com.twu.biblioteca.movie;

import com.twu.biblioteca.item.Item;

public class Movie implements Item {

    private final String movieName;
    private final int year;

    @Override
    public String toString() {
        return String.format("%-50s%-20s%-20s%-20s", movieName, year, director, rating);
    }

    @Override
    public boolean equals(Object object) {
        Movie movie = (Movie) object;
        return movie.getName().equals(movieName);
    }

    private final String director;
    private final int rating;

    public Movie(String movieName, int year, String director, int rating) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return movieName;
    }

    int getYear() {
        return year;
    }

    String getDirector() {
        return director;
    }

    int getRating() {
        return rating;
    }

}
