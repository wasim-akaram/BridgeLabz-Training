package com.binarysearch;

import java.util.Scanner;
public class RotationPoint 
{
    public static int findIndexOfRotation(int[] arr) 
    {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right])
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
 		
 		findIndexOfRotation(arr);
    	
    }
}
