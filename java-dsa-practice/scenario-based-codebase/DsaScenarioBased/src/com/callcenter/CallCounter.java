package com.callcenter;

import java.util.HashMap;


public class CallCounter
{
    private HashMap<Integer, Integer> callCountMap = new HashMap<>();

    // increment call count
    public void recordCall(int customerId)
    {
        callCountMap.put(
                customerId,
                callCountMap.getOrDefault(customerId, 0) + 1
        );
    }

    // display call count
    public void displayCallCount()
    {
        System.out.println("\nCustomer Call Count This Month:");
        for (Integer id : callCountMap.keySet())
        {
            System.out.println("Customer ID: " + id +
                    " | Calls: " + callCountMap.get(id));
        }
    }
}
