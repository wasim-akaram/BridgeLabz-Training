package com.linearsearch;
import java.util.ArrayList;

public class WordSearch 
{
	
	public static void main(String args[])
	{
		
		
		ArrayList <String> list = new ArrayList<>();
		list.add("Hello! How are you?");
		list.add("How are you doing?");
		list.add("What do you know about nme?");
		int size = list.size();
		
		//method to find the word
		String word = "x";
		
		for(int i=0; i<size; i++)
		{
			if(list.get(i).contains(word))
			{
				System.out.println(list.get(i));
				return;
			}
			if((i == size-1) && !(list.get(i).contains(word)))
			{
				System.out.println("Not found");
			}
		}
	}
}
