package com.movietime;

import java.util.ArrayList;
import java.util.List;

public class Main
{

	 public static void main(String[] args) 
	 {
	        List<MovieShow> shows = new ArrayList<>();

	       
	        shows.add(new MovieShow("I", 600));  
	        shows.add(new MovieShow("Lucky the Racer", 780)); 
	        shows.add(new MovieShow("Avengers End game", 1020)); 

	       
	        shows.add(new MovieShow("Dangal", 840)); 

	        insertionSort(shows);

	        System.out.println("Sorted Show Timings:");
	        for (MovieShow show : shows)
	        {
	            System.out.println(show);
	        }
	    }
    public static void insertionSort(List<MovieShow> shows) 
    {
        for (int i = 1; i < shows.size(); i++) 
        {
            MovieShow key = shows.get(i);
            int j = i - 1;

            while (j >= 0 && shows.get(j).showTime > key.showTime) 
            {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }

   
}