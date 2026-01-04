package com.encapsulation.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args) 
    {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVeg("Chicken Biryani", 300, 1));

        double grandTotal = 0;

        for (FoodItem item : order)
        {
        
            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = item.applyDiscount();

            System.out.println(item.getDiscountDetails());
            System.out.println("Item Total  : " + totalPrice);
            System.out.println("Discount    : " + discount);

            grandTotal += (totalPrice - discount);
        }

        
        System.out.println("\nGrand Total Amount: " + grandTotal);
    }
}
