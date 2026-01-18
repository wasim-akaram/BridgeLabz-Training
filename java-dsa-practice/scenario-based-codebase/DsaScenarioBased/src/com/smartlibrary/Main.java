package com.smartlibrary;
public class Main 
{

    public static void main(String[] args) 
    {

        Book[] borrowedBooks = {
            new Book("Data Structures"),
            new Book("Algorithms"),
            new Book("Operating Systems"),
            new Book("Computer Networks"),
            new Book("Database Systems")
        };

        InsertionSort sorter = new InsertionSort();
        sorter.sort(borrowedBooks);

        System.out.println("Borrowed Books (Alphabetical Order):");
        for (Book b : borrowedBooks) 
        {
            System.out.println(b.title);
        }
    }
}
