package com.callcenter;

import java.util.LinkedList;
import java.util.Queue;

public class NormalCallQueue
{
    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer customer)
    {
        queue.add(customer);
    }

    public Customer getNextCustomer()
    {
        return queue.poll();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
}
