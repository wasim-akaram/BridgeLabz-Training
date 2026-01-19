package com.binarysearch;

import java.util.Scanner;

public class PeakElement 
{
    public static int findPeak(int[] arr)
    {
        int left = 0, right = arr.length - 1;

        while (left < right) 
        {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
    
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
 		
 		findPeak(arr);
    	
    }
}



