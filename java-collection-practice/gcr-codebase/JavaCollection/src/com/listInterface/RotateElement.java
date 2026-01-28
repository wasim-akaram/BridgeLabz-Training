package com.listInterface;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RotateElement 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter 5 elements");
		for(int i=0; i<5; i++)
		{
			int a = sc.nextInt();
			list.add(a);
		}
		
		System.out.println("\nThe list is ");
		System.out.println(list);
		
		System.out.println("Enter the position to rotate");
		int position = sc.nextInt();
		
		
		
		List<Integer> rotatedlist = new ArrayList<>();
		for(int i= position; i<list.size(); i++)
		{
			rotatedlist.add(list.get(i));
		}
		for(int i=0; i<position; i++)
		{
			rotatedlist.add(list.get(i));
		}
		
		System.out.println("\nThe rotated list");
		System.out.println(rotatedlist);
		
		
		
		
	}

}
