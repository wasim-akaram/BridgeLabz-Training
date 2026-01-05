package com.linkedlist.moviemanagementsystem;

class Movie
{
    String title;
    int year;
    double rating;
    String director;
    

    Movie prev;
    Movie next;

    Movie(String title, String director, int year, double rating) 
    {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
