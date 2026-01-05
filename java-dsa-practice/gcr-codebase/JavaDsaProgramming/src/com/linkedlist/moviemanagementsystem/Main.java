package com.linkedlist.moviemanagementsystem;

public class Main 
{

    public static void main(String[] args) 
    {

        MovieLinkedList list = new MovieLinkedList();

        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 9.0);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.8);
        list.addAtEnd("Avatar", "James Cameron", 2009, 8.0);

        list.addAtPosition("Titanic", "James Cameron", 1997, 7.9, 2);

        System.out.println("---- Forward Display ----");
        list.displayForward();

        System.out.println("---- Reverse Display ----");
        list.displayReverse();

        System.out.println("---- Search by Director ----");
        list.searchByDirector("James Cameron");

        list.updateRating("Avatar", 8.3);

        list.removeByTitle("Titanic");

        System.out.println("---- After Deletion ----");
        list.displayForward();
    }
}
