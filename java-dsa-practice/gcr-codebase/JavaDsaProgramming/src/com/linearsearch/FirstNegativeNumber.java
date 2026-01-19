package com.linearsearch;

import java.util.Scanner;
public class FirstNegativeNumber 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		 int size = sc.nextInt();
		int[] arr = new int[size];
		
		//ask the user to provide input
		System.out.println("Enter the element \n");
		
		for(int i =0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		findnegative(arr,size);
	}
		
		//method for finding the first negative number
		public static void findnegative(int []arr, int size)
		{
			for(int i =0; i<size; i++)
			{
				if(arr[i]<0)
				{
					System.out.println("The first negative number is on the index " + i);
					return;
				}
				
			}
			System.out.println(-1);
		}
		
	}



