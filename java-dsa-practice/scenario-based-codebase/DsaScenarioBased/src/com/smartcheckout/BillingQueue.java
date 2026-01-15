package com.smartcheckout;

import java.util.*;

public class BillingQueue
{
    Queue<CustomerNode> queue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    // add customer
    public void enqueue(CustomerNode customer)
    {
        queue.add(customer);
        System.out.println("Customer added: " + customer.customerId);
    }

    // remove customer
    public void dequeue()
    {
        if (queue.isEmpty())
        {
            System.out.println("No customers in queue");
            return;
        }

        CustomerNode customer = queue.poll();
        int total = 0;

        for (String item : customer.items)
        {
            if (stockMap.get(item) > 0)
            {
                total += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            }
        }

        System.out.println("Customer " + customer.customerId +
                " bill amount: " + total);
    }
}
