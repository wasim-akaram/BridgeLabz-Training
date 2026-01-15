package com.smartcheckout;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        BillingQueue billing = new BillingQueue();

        billing.priceMap.put("Milk", 40);
        billing.priceMap.put("Bread", 30);

        billing.stockMap.put("Milk", 5);
        billing.stockMap.put("Bread", 5);

        CustomerNode c1 = new CustomerNode(1, Arrays.asList("Milk", "Bread"));
        CustomerNode c2 = new CustomerNode(2, Arrays.asList("Milk"));

        billing.enqueue(c1);
        billing.enqueue(c2);

        billing.dequeue();
        billing.dequeue();
    }
}
