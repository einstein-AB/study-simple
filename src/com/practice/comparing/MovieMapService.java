package com.practice.comparing;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieMapService {

    public static Map<Integer, String> getMovieMap() {

        //Get hardcoded dummy list
        List<Movie> movieList = MovieListService.getMovieList();

        //Convert list to Map<ID, movieName>
        return movieList.stream()
                .collect(Collectors.toMap(
                        movie -> movie.getMovieId(),    //key
                        movie -> movie.getMovieName()));//value
    }
}
