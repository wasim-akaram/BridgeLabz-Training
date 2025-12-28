package com.constructor.levelOne;

public class Book 
{
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public double getPrice() 
    {
        return price;
    }

    public boolean isAvailable()
    
    {
        return isAvailable;
    }

    public boolean borrowBook() 
    {
        if (isAvailable) 
        {
            isAvailable = false; 
            System.out.println("You have successfully borrowed: " + title);
            return true;
        } 
        else 
        {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
            return false;
        }
    }

    public void returnBook() 
    {
        isAvailable = true; 
        System.out.println("You have successfully returned: " + title);
    }
}