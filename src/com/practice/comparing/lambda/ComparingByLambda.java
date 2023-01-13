package com.practice.comparing.lambda;

import com.practice.comparing.Movie;
import com.practice.comparing.MovieListService;

import java.util.*;
import java.util.stream.Collectors;

public class ComparingByLambda {

    public static void main(String[] args) {

        //Get hardcoded dummy list
        List<Movie> movieList = MovieListService.getMovieList();

        //Sort by MovieId
        Collections.sort(movieList, (m1, m2) -> {
            if(m1.getMovieId() < m2.getMovieId()) return -1;
            if(m1.getMovieId() > m2.getMovieId()) return 1;
            else return 0;
        });

        //Sort by MovieName
        Collections.sort(movieList, (m1, m2) -> m1.getMovieName().compareTo(m2.getMovieName()));

        //Sort by MovieRatings
        Collections.sort(movieList, Comparator.comparing(movie -> movie.getMovieRating()));
    }
}
