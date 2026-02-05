package com.streamAPI.trendingMovies;
import java.util.*;
import java.util.stream.*;

public class TrendingMovies 
{

    public static void main(String[] args) 
    {

        List<Movie> movies = Arrays.asList(
            new Movie("Tenet", 8.9, 2024),
            new Movie("Interstellar B", 9.1, 2023),
            new Movie("Inception", 8.5, 2022),
            new Movie("Twilight", 9.0, 2024),
            new Movie("Shrek", 7.9, 2021),
            new Movie("Ferdinand", 9.3, 2023),
            new Movie("Penguins of MAdagascar", 8.8, 2024),
            new Movie("Ice Age", 9.2, 2022)
        );

        List<Movie> top5Trending = movies.stream()

           
            .filter(m -> m.year >= 2022)

            
            .sorted(Comparator.comparing((Movie m) -> m.rating).reversed()
            .thenComparing(m -> m.year).reversed()
            )

 
            .limit(5)

          
            .collect(Collectors.toList());

        top5Trending.forEach(System.out::println);
    }
}
