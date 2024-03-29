package com.practice.movie;

public class MovieRatingDetails {

    private Integer movieId;
    private String movieName;
    private Integer movieRating;

    public MovieRatingDetails(Integer movieId, String movieName, Integer movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
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

    @Override
    public String toString() {
        return "MovieRatingDetails{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieRating=" + movieRating +
                '}';
    }
}
