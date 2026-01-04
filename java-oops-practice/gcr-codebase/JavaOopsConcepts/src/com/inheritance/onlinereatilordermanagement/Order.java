package com.inheritance.onlinereatilordermanagement;


import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Order 
{
	protected String orderID;
	protected LocalDate orderDate;
	
	public Order(String orderID, String orderDate) 
	{
		this.orderID = orderID;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		this.orderDate = LocalDate.parse(orderDate, format);
	}
	
	public void getOrderStatus() 
	{
		System.out.println("Order ID: " + orderID);
		System.out.println("Order date: " + orderDate);
	}
	
}