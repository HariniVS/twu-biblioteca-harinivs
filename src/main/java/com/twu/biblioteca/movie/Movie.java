package com.twu.biblioteca.movie;

public class Movie {

    private final String movieName;
    private final int year;

    @Override
    public String toString() {
        return  movieName + " " + year + " " + director + " " + rating;
    }

    @Override
    public boolean equals(Object object) {
        Movie movie = (Movie) object;
        return movie.getMovieName().equals(movieName);
    }

    private final String director;
    private final int rating;

    public Movie(String movieName, int year, String director, int rating) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    String getMovieName() {
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
