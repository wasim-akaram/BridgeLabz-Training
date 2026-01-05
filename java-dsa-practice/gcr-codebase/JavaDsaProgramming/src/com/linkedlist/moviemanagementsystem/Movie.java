package com.linkedlist.moviemanagementsystem;

class MovieNode
{
    String title;
    int year;
    double rating;
    String director;
    

    MovieNode prev;
    MovieNode next;

    MovieNode(String title, String director, int year, double rating) 
    {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
