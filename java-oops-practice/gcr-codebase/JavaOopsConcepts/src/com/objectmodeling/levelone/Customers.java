package com.objectmodeling.levelone;

import java.util.ArrayList;
import java.util.List;

class Customers
{
   // private int customerId;
    private String name;
    private List<Order> orders;

    Customers(int customerId, String name) 
    {
        //this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order order) 
    {
        orders.add(order);
        System.out.println(
            "Customer " + name +
            " placed Order " + order
        );
    }

    void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}
