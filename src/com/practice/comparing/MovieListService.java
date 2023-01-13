package com.practice.comparing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MovieListService {

    public static List<Movie> getMovieList() {
        List<Movie> movieList = new ArrayList<>();

        //Creating unique Ids for Movie model objects
        List<Integer> movieIds = IntStream.rangeClosed(1, 10)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        //Shuffling movie Ids for randomness
        Collections.shuffle(movieIds);

        //Creating list of movie objects
        movieIds.forEach(ids -> {
            movieList.add(new Movie(ids, "Movie "+ids, Integer.parseInt(ids.toString().split("")[0])));
        });

        return movieList;
    }
}
