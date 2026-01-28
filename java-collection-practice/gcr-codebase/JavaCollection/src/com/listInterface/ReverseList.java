package com.listInterface;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ReverseList 
{
	
	
	   public static void main(String[] args) 
	    {
	        List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(12);
	        list.add(67);
	        list.add(45);
	        list.add(20);
	        list.add(6);
	        
	        
	        System.out.println("\nList after reversing");
	        
	        //reversing using built-in method and displaying the elements
	        ReverseList.reverse(list);
	        
	    
	        
	        
	        //implementation using linked list
	        LinkedList<Integer> linkedlist = new LinkedList<>();
	        linkedlist.add(40);
	        linkedlist.add(5);
	        linkedlist.add(64);
	        linkedlist.add(12);
	        linkedlist.add(22);
	        linkedlist.add(18);
	        linkedlist.add(9);
	        
	        System.out.println("\nLinkedlist after reversing");
	      //reversing using built-in method
	        ReverseList.reverselinkedlist(linkedlist);
	        
	        }
	   
	   public static void reverse(List<Integer> list)
	   {
		   
		   int size = list.size();
		   for(int i = 0; i < size; i++)
		   {
			   //reversedlist.add(list.get(i));
			   System.out.println(list.get(i));
		   }
		   
	   }
	   public static void reverselinkedlist(LinkedList<Integer> linkedlist)
	   {
		   
		   int size = linkedlist.size();
		   for(int i = 0; i < size; i++)
		   {
			   System.out.println(linkedlist.get(i));
		   }
		   
	   }
}
