package com.practice.comparing.comparable;

import com.practice.comparing.Movie;
import com.practice.comparing.MovieListService;

import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        //Dummy hardcoded movie list
        List<Movie> movieList = MovieListService.getMovieList();

        System.out.println("Before sorting movie list:");
        movieList.forEach(movie -> System.out.println(movie));

        //Sorts the given movie list by `comparable` implementation on model class
        Collections.sort(movieList);

        System.out.println("After sorting movie list:");
        movieList.forEach(movie -> System.out.println(movie));
    }
}
