package com.binarysearch;

import java.util.Scanner;

public class FirstLastOccurance 
{
	
	    static int findFirst(int[] arr, int x) 
	    {
	        int l = 0, r = arr.length - 1, res = -1;
	        while (l <= r) {
	            int mid = (l + r) / 2;
	            if (arr[mid] == x) {
	                res = mid;
	                r = mid - 1;
	            } else if (arr[mid] < x) l = mid + 1;
	            else r = mid - 1;
	        }
	        return res;
	    }

	    static int findLast(int[] arr, int x)
	    {
	        int l = 0, r = arr.length - 1, res = -1;
	        while (l <= r) {
	            int mid = (l + r) / 2;
	            if (arr[mid] == x) {
	                res = mid;
	                l = mid + 1;
	            } else if (arr[mid] < x) l = mid + 1;
	            else r = mid - 1;
	        }
	        return res;
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
	 		
	 		System.out.println("Enter the target to search");
	    	 int target = sc.nextInt();
	    	 
	    	 findFirst(arr,target);
	    	 findLast(arr,target);
	    	
	    }
	}



