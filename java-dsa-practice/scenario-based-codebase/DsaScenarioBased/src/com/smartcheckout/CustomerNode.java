package com.smartcheckout;

import java.util.List;

public class CustomerNode
{
    int customerId;
    List<String> items;

    public CustomerNode(int customerId, List<String> items)
    {
        this.customerId = customerId;
        this.items = items;
    }
}
