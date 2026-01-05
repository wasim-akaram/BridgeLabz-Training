package com.linkedlist.ticketreservationsystem;

public class Main 
{

    public static void main(String[] args) 
    {

        Ticket tickets = new Ticket();

        tickets.addTicket(101, "Wasim", "Zootopia", "A1", "10:30 AM");
        tickets.addTicket(102, "Vipin", "Dhurandhar", "B2", "11:00 AM");
        tickets.addTicket(103, "Vishal", "Gangs Of Wasseypur", "A3", "11:15 AM");

        System.out.println("---- All Tickets ----");
        tickets.displayTickets();

        System.out.println("---- Search by Customer ----");
        tickets.searchByCustomer("Wasim");

        System.out.println("---- Search by Movie ----");
        tickets.searchByMovie("Inception");

        tickets.removeTicket(102);

        System.out.println("---- After Cancellation ----");
        tickets.displayTickets();

        tickets.countTickets();
    }
}
