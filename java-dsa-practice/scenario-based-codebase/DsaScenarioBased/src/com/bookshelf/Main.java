package com.bookshelf;

public class Main
{

	public static void main(String[]args) 
	{
		
		Library library = new Library();
		
		library.addBook("Programming", new Book("Effective Java","Joshua Bloch"));
		library.addBook("Novel", new Book("Godan","Prem Chand"));
		library.addBook("History",new Book("The Odyssey","Homer "));
		
        library.displayGenre("Novel");
        library.removeBook("Novel","Godan");
        System.out.println();
        System.out.println("After removing book: ");
        library.displayGenre("Novel");
        
	}
}