package com.practice.comparing.comparator;

import com.practice.comparing.Movie;
import com.practice.comparing.MovieListService;

import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        //Dummy hardcoded movie list
        List<Movie> movieList = MovieListService.getMovieList();

        System.out.println("Before sorting movie list:");
        movieList.forEach(movie -> System.out.println(movie));
        System.out.println("<<<====****************====>>>");

        //Sort by MovieId
        Collections.sort(movieList, new MovieIdComparator());
        System.out.println("After sorting movie list by movieId:");
        movieList.forEach(movie -> System.out.println(movie));
        System.out.println("==========================");

        //Sort by MovieName
        Collections.sort(movieList, new MovieNameComparator());
        System.out.println("After sorting movie list by movieName:");
        movieList.forEach(movie -> System.out.println(movie));
        System.out.println("==========================");

        //Sort by MovieRatings
        Collections.sort(movieList, new MovieRatingsComparator());
        System.out.println("After sorting movie list by movieRatings:");
        movieList.forEach(movie -> System.out.println(movie));

    }
}
