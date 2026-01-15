package com.callcenter;

import java.util.PriorityQueue;

public class VipCallQueue
{
    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>(
                    (c1, c2) -> c1.getCustomerId() - c2.getCustomerId()
            );

    public void addCustomer(Customer customer)
    {
        vipQueue.add(customer);
    }

    public Customer getNextCustomer()
    {
        return vipQueue.poll();
    }

    public boolean isEmpty()
    {
        return vipQueue.isEmpty();
    }
}
