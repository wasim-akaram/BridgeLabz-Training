package com.lambdaExpression.customSorting;
import java.util.*;

public class ShopSorting 
{

    public static void main(String[] args) 
    {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Mobile", 30000, 4.7, 20));
        products.add(new Product("Headphones", 3000, 4.2, 30));
        products.add(new Product("Smartwatch", 8000, 4.4, 15));

        // Sort by Price 
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        //  Sort by Rating 
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        //  Sort by Discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
