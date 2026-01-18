package com.artexpo;
public class Main 
{

    public static void main(String[] args) 
    {

        Artist[] artists = {
            new Artist("Riya", 1705401000L),
            new Artist("Aman", 1705401200L),
            new Artist("Neha", 1705401150L),
            new Artist("Karan", 1705401300L),
            new Artist("Sneha", 1705401100L)
        };

        InsertionSort sorter = new InsertionSort();
        sorter.sort(artists);

        System.out.println("Artists Sorted by Registration Time:");
        for (Artist a : artists) 
        {
            System.out.println(a.name + " -> " + a.registrationTime);
        }
    }
}
