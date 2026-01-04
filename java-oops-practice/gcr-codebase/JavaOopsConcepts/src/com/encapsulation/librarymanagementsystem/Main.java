package com.encapsulation.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args) 
    {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Harry Potter", "J.K. Rowling"));
        items.add(new Magazine(2, "Forbes", "XYZ"));
        

        for (LibraryItem item : items) 
        {
            
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Available    : " + item.checkAvailability());

            item.reserveItem("User1");
            System.out.println("Available    : " + item.checkAvailability());
        }
    }
}
