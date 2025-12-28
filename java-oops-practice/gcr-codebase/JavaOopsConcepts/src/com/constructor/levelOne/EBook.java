package com.constructor.levelOne;

public class EBook extends Boooks
{
    public EBook(String ISBN, String title, String author) 
    {
        super(ISBN, title, author);
    }

    public void displayDetails() 
    {
        
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}
