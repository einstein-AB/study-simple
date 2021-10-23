package com.practice.movie;

public class MovieRatingDetails {

    private String movieName;
    private Integer movieRating;

    public MovieRatingDetails(String movieName, Integer movieRating) {
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Integer movieRating) {
        this.movieRating = movieRating;
    }
}
