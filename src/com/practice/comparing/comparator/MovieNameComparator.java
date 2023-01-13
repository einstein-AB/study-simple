package com.practice.comparing.comparator;

import com.practice.comparing.Movie;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie> {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     */
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getMovieName().compareTo(m2.getMovieName());
    }
}
