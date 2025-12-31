package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Library 
{
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor
    public Library(String libraryName)
    {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) 
    {
        books.add(book);
    }

    // Display library books
    public void displayLibraryBooks() 
    {
        System.out.println("Library: " + libraryName);
        for (Book book : books) 
        {
            book.displayBook();
        }
        System.out.println();
    }
}

