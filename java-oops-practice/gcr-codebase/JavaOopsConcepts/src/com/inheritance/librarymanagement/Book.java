package com.inheritance.librarymanagement;

public class Book 
{
	String title ;
	int publicationYear;
	
	public Book(String title, int publicationYear)
	{
		this.title = title;
		this.publicationYear= publicationYear;
		
	}
	
	public void displayInfo()
	{
		System.out.println("\nBook: " + title);
		System.out.println("Published in: " + publicationYear);
	}

}
