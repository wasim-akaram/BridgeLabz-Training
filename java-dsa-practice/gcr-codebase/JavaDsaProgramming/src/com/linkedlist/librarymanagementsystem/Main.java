package com.linkedlist.librarymanagementsystem;

public class Main
{

    public static void main(String[] args) {

        Library library = new Library();

        library.addAtEnd(101, "Harry Potter", "JK Rowling", "Story", true);
        library.addAtEnd(102, "Malgudy Days", "Rudyard Kipling", "Story", true);
        library.addAtBeginning(103, "The Alchemist", "Paulo Coelho", "Fiction", false);
        library.addAtPosition(104, "Atomic Habits", "James Clear", "Self Help", true, 2);

        System.out.println("---- Forward Display ----");
        library.displayForward();

        System.out.println("---- Reverse Display ----");
        library.displayReverse();

        System.out.println("---- Search by Author ----");
        library.searchByAuthor("Joshua Bloch");

        library.updateAvailability(103, true);

        library.removeByBookId(102);

        System.out.println("---- After Deletion ----");
        library.displayForward();

        library.countBooks();
    }
}
