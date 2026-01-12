package com.browserbuddy;



import java.util.*;

public class Main 
{
	
	public static void main(String[]args) 
	{
		
		Stack<Tab> closedTabs = new Stack<>();
		
		Tab tab1 = new Tab("google.com");
		
		tab1.visit("YouTube.com");
		tab1.visit("Github.com");
		
		tab1.back(); // YouTube
		tab1.back(); // google
		
		tab1.forward(); // youtube
		
		tab1.displayCurrentPage();
		
	}

}