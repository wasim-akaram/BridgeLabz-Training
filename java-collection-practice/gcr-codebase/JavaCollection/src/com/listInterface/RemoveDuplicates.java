package com.listInterface;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates 
{
	  public static void main(String[] args) 
	    {
		  Scanner sc = new Scanner(System.in);
	        List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(12);
	        list.add(67);
	        list.add(45);
	        list.add(20);
	        list.add(10);
	        list.add(12);
	        list.add(67);
	        list.add(45);
	        list.add(20);
	        list.add(10);
	        list.add(12);
	        list.add(67);
	        list.add(45);
	        
	        list.add(21);
	        
	        System.out.println("\nOriginal list");
	        System.out.println(list);
	        
	      
	        for(int i=0; i<(list.size())-1; i++)
	        {
	        	for(int j=i+1; j<list.size(); j++)
	        	{
		        	if(list.get(i)==list.get(j))
		        	{
		        		list.remove(j);
		        	
		        	}
	        	}
	        }
	        
	        
	        System.out.println("\nThe list after removing duplicates");
	        System.out.println(list);
	        
	        
	    }

}
