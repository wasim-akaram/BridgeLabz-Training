package com.collectors.orderRevnueSummary;

public class Customer
{
	private String name;
	private Double amount;
	
	public Customer(String name, Double amount)
	{
		this.name = name;
		this.amount = amount;
	}
public double getAmount()
{
	return amount;
	
}

public String getCustomer()
{
	return name;
}
}
