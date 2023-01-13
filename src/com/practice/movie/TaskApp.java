package com.practice.movie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskApp {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<MovieRatingDetails> movieRatingDetails = new ArrayList<>();

        String movieName;
        Integer movieRatings;
        boolean validRating, userContinues = false;

        System.out.println("Hello User");
        do {
            movieName = readMovieName(reader);
            movieRatings = readMovieRatings(reader);

            validRating = (movieRatings <= 10 && movieRatings > 1);

            if (validRating) {
                movieRatingDetails.add(new MovieRatingDetails(new Random().nextInt(),movieName, movieRatings));
                userContinues = wishToContinue(reader);
            } else {
                System.out.println("Invalid Ratings. Please try again!");
                continue;
            }

        } while (userContinues);


        Map<String, List<MovieRatingDetails>> collectMap = movieRatingDetails.stream()
                .collect(Collectors.groupingBy(MovieRatingDetails::getMovieName));

        Map<String, Double> finalResult = new HashMap<>();
        for (Map.Entry<String, List<MovieRatingDetails>> entryData : collectMap.entrySet()) {

            String movie = entryData.getKey();
            List<MovieRatingDetails> ratingDetailsList = entryData.getValue();

            Double avgRatings = ratingDetailsList.stream()
                    .mapToInt(val -> val.getMovieRating())
                    .summaryStatistics()
                    .getAverage();

            finalResult.put(movie, avgRatings);
        }

        finalResult.forEach((mov, avg) -> System.out.println(mov + "::" + avg));
    }

    public static String readMovieName(BufferedReader reader) throws Exception {
        System.out.println("Enter Movie name");
        String movieName = reader.readLine();
        return movieName;
    }

    public static Integer readMovieRatings(BufferedReader reader) throws Exception {
        System.out.println("Enter Movie rating from 1 to 10");
        Integer movieRatings = Integer.parseInt(reader.readLine());
        return movieRatings;
    }

    public static boolean wishToContinue(BufferedReader reader) throws Exception {
        System.out.println("Do you want to continue ? Press Y or N");
        String userInput = reader.readLine();
        return userInput.equalsIgnoreCase("Y");
    }
}
