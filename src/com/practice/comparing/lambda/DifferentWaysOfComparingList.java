package com.practice.comparing.lambda;

import com.practice.comparing.Movie;
import com.practice.comparing.MovieListService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DifferentWaysOfComparingList {
    public static void main(String[] args) {

        //Get hardcoded dummy list
        List<Movie> movieList = MovieListService.getMovieList();

        //1 Using Collections.sort()
        Collections.sort(movieList, Comparator.comparing(movie -> movie.getMovieId()));

        //2 Using stream.sorted()
        movieList.stream()
                .sorted((o1, o2) -> o1.getMovieName().compareTo(o2.getMovieName()));

        //3 Using list.sort()
        movieList.sort((o1, o2) -> o1.getMovieRating().compareTo(o2.getMovieRating()));
    }
}
