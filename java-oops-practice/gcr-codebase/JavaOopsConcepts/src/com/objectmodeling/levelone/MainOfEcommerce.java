package com.objectmodeling.levelone;

public class MainOfEcommerce 
{
	 public static void main(String[] args) 
	    {

	        Customers c1 = new Customers(1, "Wasim");

	        Product p1 = new Product(101, "Laptop", 60000);
	        Product p2 = new Product(102, "Mouse", 500);
	        Product p3 = new Product(103, "Keyboard", 1500);

	        Order o1 = new Order(1001);

	        o1.addProduct(p1);
	        o1.addProduct(p2);
	        o1.addProduct(p3);

	        c1.placeOrder(o1);

	        System.out.println();
	        c1.showOrders();
	    }
}

	
	
	


