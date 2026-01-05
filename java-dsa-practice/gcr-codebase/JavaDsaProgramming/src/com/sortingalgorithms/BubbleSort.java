package com.sortingalgorithms;

import java.util.*;
public class BubbleSort 
{
	public static void bubbleSort (int [] arr)
	{

	        int n = arr.length;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) 
	        {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++)
	            {
	                if (arr[j] > arr[j + 1]) 
	                {
	                    // Swap arr[j] and arr[j+1]
	                	
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (!swapped) break; // Optimization: Stop if no swaps occurred
	        }
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = sc.nextInt();
		
		System.out.println("Enter their marks");
		int [] marksArray = new int[number];
		
		for(int i=0; i<number; i++)
		{
			marksArray[i] = sc.nextInt();
		}
		
		bubbleSort(marksArray);
		
		//printing the results
		System.out.println("The marks in sorted order is");
		 System.out.println(Arrays.toString(marksArray));
		
		sc.close();
	}

	

}
