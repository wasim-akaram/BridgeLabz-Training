package com.linkedlist.ticketreservationsystem;



class Ticket 
{

    private TicketNode head;
    private TicketNode tail;
    private int ticketCount = 0;

    // 1. Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) 
    {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) 
        {
            head = tail = newNode;
            newNode.next = newNode;
        }
        else 
        {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        ticketCount++;
        System.out.println("Ticket booked successfully");
    }

    // 2. Remove ticket by Ticket ID
    public void removeTicket(int id) 
    {
        if (head == null) 
        {
            System.out.println("No tickets to remove");
            return;
        }

        // Single ticket case
        if (head == tail && head.ticketId == id) 
        {
            head = tail = null;
            ticketCount--;
            System.out.println("Ticket cancelled");
            return;
        }

        // Remove head
        if (head.ticketId == id) 
        {
            head = head.next;
            tail.next = head;
            ticketCount--;
            System.out.println("Ticket cancelled");
            return;
        }

        TicketNode prev = head;
        TicketNode curr = head.next;

        while (curr != head && curr.ticketId != id) 
        {
        	
            prev = curr;
            curr = curr.next;
        }

        if (curr == head) 
        {
            System.out.println("Ticket not found");
            return;
        }

        prev.next = curr.next;

        if (curr == tail) 
        {
            tail = prev;
        }

        curr.next = null; // good practice
        ticketCount--;
        System.out.println("Ticket cancelled");
    }

    // 3. Display all tickets
    public void displayTickets() 
    {
        if (head == null) 
        {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // 4. Search ticket by Customer Name
    public void searchByCustomer(String customer) 
    {
        if (head == null) 
        {
            System.out.println("No tickets available");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do 
        {
            if (temp.customerName.equalsIgnoreCase(customer)) 
            {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) 
        {
            System.out.println("No ticket found for customer: " + customer);
        }
    }

    // 5. Search ticket by Movie Name
    public void searchByMovie(String movie) 
    {
        if (head == null) 
        {
            System.out.println("No tickets available");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do
        {
            if (temp.movieName.equalsIgnoreCase(movie)) 
            {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } 
        while (temp != head);

        if (!found) 
        {
            System.out.println("No ticket found for movie: " + movie);
        }
    }

    // 6. Count total tickets
    public void countTickets() 
    {
        System.out.println("Total booked tickets: " + ticketCount);
    }

    // Helper method
    private void displayTicket(TicketNode t) 
    {
    
        System.out.println("Ticket ID     : " + t.ticketId);
        System.out.println("Customer Name : " + t.customerName);
        System.out.println("Movie Name    : " + t.movieName);
        System.out.println("Seat Number   : " + t.seatNumber);
        System.out.println("Booking Time  : " + t.bookingTime);
    }
}
