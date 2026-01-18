package com.eventmanager;


public class Main
{

    public static void main(String[] args) 
    {

        Ticket[] tickets = {
            new Ticket(1200),
            new Ticket(450),
            new Ticket(3000),
            new Ticket(800),
            new Ticket(150),
            new Ticket(600)
        };

        QuickSort sorter = new QuickSort();
        sorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Top Cheapest Tickets:");
        for (int i = 0; i < Math.min(3, tickets.length); i++) {
            System.out.println("₹" + tickets[i].price);
        }

        System.out.println("\nTop Expensive Tickets:");
        for (int i = tickets.length - 1; i >= Math.max(tickets.length - 3, 0); i--) 
        {
            System.out.println("₹" + tickets[i].price);
        }
    }
}
