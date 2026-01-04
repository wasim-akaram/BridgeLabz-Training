package com.encapsulation.librarymanagementsystem;

public interface Reserve
{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
