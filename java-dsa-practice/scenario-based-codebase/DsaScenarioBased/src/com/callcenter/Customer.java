package com.callcenter;

public class Customer

{
    private int customerId;
    private String name;
    private boolean vip;

    // constructor
    public Customer(int customerId, String name, boolean vip)
    {
        this.customerId = customerId;
        this.name = name;
        this.vip = vip;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public String getName()
    {
        return name;
    }

    public boolean isVip()
    {
        return vip;
    }
}
