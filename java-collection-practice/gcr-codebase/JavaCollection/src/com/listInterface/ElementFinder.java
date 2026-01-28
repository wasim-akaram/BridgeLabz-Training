package com.listInterface;

import java.util.*;
public class ElementFinder 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("Banana");
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		list.add("Kiwi");
		list.add("Kiwi");
		
		  System.out.println("we have Kiwi, Banana, Apple, Orange");
		  System.out.println("Enter the name of the fruit to find");
		  String search = sc.next();
		  for(int i=list.size()-1; i>=0; i--)
		  {
			  if(list.get(i).equals(search))
			  {
				  System.out.println("That element is at "+ (i-((list.size())-1))+ " index from the end.");
				  break;
			  }
		  }
	}
}
