package com.robowarehouse;
public class Main 
{

    public static void main(String[] args) 
    {

        Package[] shelf = {
            new Package(20),
            new Package(5),
            new Package(15),
            new Package(10),
            new Package(8)
        };

        InsertionSort sorter = new InsertionSort();
        sorter.sort(shelf);

        System.out.println("Shelf Order (Ascending by Weight):");
        for (Package p : shelf) 
        {
            System.out.print(p.weight + " ");
        }
    }
}
