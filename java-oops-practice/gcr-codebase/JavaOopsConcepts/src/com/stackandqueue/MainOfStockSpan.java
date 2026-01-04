package com.stackandqueue;

public class MainOfStockSpan 
{
	

	    public static void main(String[] args) 
	    {

	        int[] price = {120, 90, 65, 71, 48, 57, 5};

	        int[] span = StockSpan.calculateSpan(price);

	        System.out.println("Stock Prices:");
	        for (int p : price) 
	        {
	            System.out.print(p + " ");
	        }

	        System.out.println("\nStock Span:");
	        for (int s : span) 
	        {
	            System.out.print(s + " ");
	        }
	    }
	


}
