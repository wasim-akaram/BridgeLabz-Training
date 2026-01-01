package com.objectmodeling.levelone;

public class MainOfLibrary 
{
    public static void main(String[] args) 
    {

        // Books exist independently
        Book book1 = new Book("Java Programing", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Data Structures", "Mark Allen Weiss");
        Book book4 = new Book("DataBase Management System", "Jennifer Widom");

        // Create libraries
        Library bhopalLibrary = new Library("Bhopal Library");
        Library mainLibrary = new Library("Main Library");

        // Add books to libraries
        bhopalLibrary.addBook(book1);
        bhopalLibrary.addBook(book2);

        mainLibrary.addBook(book3); 
        mainLibrary.addBook(book4);

        // Displaying libraries
        bhopalLibrary.displayLibraryBooks();
        mainLibrary.displayLibraryBooks();
    }
}
