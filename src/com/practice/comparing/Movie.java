package com.practice.comparing;

public class Movie implements Comparable<Movie> {

    private Integer movieId;
    private String movieName;
    private Integer movieRating;

    public Movie(Integer movieId, String movieName, Integer movieRating) {
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
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieRating=" + movieRating +
                '}';
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     */
    @Override
    public int compareTo(Movie movie) {
        return this.movieRating - movie.movieRating;
    }
}
