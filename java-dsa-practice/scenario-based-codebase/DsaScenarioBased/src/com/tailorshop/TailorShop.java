package com.tailorshop;

import java.time.LocalDate;

public class TailorShop 
{

    
    public static void insertionSort(DressOrder[] orders) 
    {

        for (int i = 1; i < orders.length; i++) 
        {
            DressOrder key = orders[i];
            int j = i - 1;

            // Compare LocalDate using isAfter()
            while (j >= 0 && orders[j].deadline.isAfter(key.deadline)) 
            {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = key;
        }
    }

    // Print orders
    public static void printOrders(DressOrder[] orders) 
    {
        for (DressOrder i : orders)
        {
            System.out.println(i);
        }
    }

    // Main method to test
    public static void main(String[] args) 
    {

        DressOrder[] orders = 
        	{
            new DressOrder(1, LocalDate.of(2026, 2, 10)),
            new DressOrder(2, LocalDate.of(2026, 2, 15)),
            new DressOrder(3, LocalDate.of(2026, 2, 20)),
            new DressOrder(4, LocalDate.of(2026, 2, 12))
        };

        System.out.println("Before Sorting:");
        printOrders(orders);

        insertionSort(orders);

        System.out.println("\nAfter Sorting by Delivery Deadline:");
        printOrders(orders);
    }
}
