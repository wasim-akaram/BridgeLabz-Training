package com.linkedlist.inventorymanagementsystem;


public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addAtEnd(101, "Laptop", 5, 60000);
        inventory.addAtEnd(102, "Mouse", 50, 500);
        inventory.addAtBeginning(103, "Keyboard", 20, 1500);
        inventory.addAtPosition(104, "Monitor", 10, 12000, 2);

        System.out.println("---- Inventory ----");
        inventory.displayAll();

        inventory.searchById(102);
        inventory.searchByName("Laptop");

        inventory.updateQuantity(101, 8);

        inventory.calculateTotalValue();

        System.out.println("---- Sort by Name (Ascending) ----");
        inventory.sortByName(true);
        inventory.displayAll();

        System.out.println("---- Sort by Price (Descending) ----");
        inventory.sortByPrice(false);
        inventory.displayAll();

        inventory.removeByItemId(103);

        System.out.println("---- After Deletion ----");
        inventory.displayAll();
    }
}
