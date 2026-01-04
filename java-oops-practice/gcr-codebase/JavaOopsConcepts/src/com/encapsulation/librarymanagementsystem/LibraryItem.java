package com.encapsulation.librarymanagementsystem;

public abstract class LibraryItem implements Reserve
{

    private int itemId;
    private String title;
    private String author;

    // Encapsulated borrower data
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) 
    {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    
    public abstract int getLoanDuration();



    public void getItemDetails() 
    {
        System.out.println("\nItem ID   : " + itemId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
    }

    // Encapsulation: controlled access
    protected void setBorrower(String borrowerName) 
    {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    protected void clearBorrower() 
    {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    @Override
    public boolean checkAvailability() 
    {
        return isAvailable;
    }
}
