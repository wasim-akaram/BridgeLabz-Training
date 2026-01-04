package com.inheritance.onlinereatilordermanagement;



public class ShippedOrder extends Order 
{
	protected String trackingNumber;
	
	public ShippedOrder(String orderId, String orderDate, String trackingNumber)
	{
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	

	public void getOrderStatus() 
	{
		super.getOrderStatus();
		System.out.println("Tacking number " + trackingNumber);
	}
}