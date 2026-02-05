package com.collectors.libraryStatistics;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library 
{
	public static void  main(String args[])
	{
		List<Book> books = List.of(
				new Book("Harry Potter", "thriller", 790),
				new Book("Inception", "sci-fi", 560),
				new Book("Tenet", "thriller", 900),
				new Book("Dune", "sci-fi",700),
				new Book("Godan", "novel", 450));
		
		Map<String, IntSummaryStatistics> statistics =
                books.stream()
                     .collect(Collectors.groupingBy(
                             Book::getGenre,
                             Collectors.summarizingInt(Book::getPages)
                     ));

        statistics.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println();
        });
    }
}