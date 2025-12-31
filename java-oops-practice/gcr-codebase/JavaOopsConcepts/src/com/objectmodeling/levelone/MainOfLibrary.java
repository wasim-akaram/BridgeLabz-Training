package com.objectmodeling.levelone;

public class MainOfLibrary 
{
    public static void main(String[] args) 
    {

        // Books exist independently
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Data Structures", "Mark Allen Weiss");

        // Create libraries
        Library centralLibrary = new Library("Central Library");
        Library cityLibrary = new Library("City Library");

        // Add books to libraries
        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        cityLibrary.addBook(book2); // Same book in another library
        cityLibrary.addBook(book3);

        // Display libraries
        centralLibrary.displayLibraryBooks();
        cityLibrary.displayLibraryBooks();
    }
}
