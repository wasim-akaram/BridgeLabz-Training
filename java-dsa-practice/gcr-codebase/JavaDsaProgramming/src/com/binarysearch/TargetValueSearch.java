package com.binarysearch;

import java.util.Scanner;

public class TargetValueSearch 
{

	    public static boolean search(int[][] matrix, int target) 
	    {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int left = 0, right = rows * cols - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;
	            int r = mid / cols;
	            int c = mid % cols;

	            if (matrix[r][c] == target) return true;
	            if (matrix[r][c] < target) left = mid + 1;
	            else right = mid - 1;
	        }
	        return false;
	    }
	
	 public static void main(String args[])
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the size of the array as m x n");
	    	 int m = sc.nextInt();
	    	 int n = sc.nextInt();
	 		int[][] arr = new int[m][n];
	 		
	 		//ask the user to provide input
	 		System.out.println("Enter the element \n");
	 		
	 		for(int i =0; i<m; i++)
	 		{
	 			for(int j =0; i<n; i++)
		 		{
		 			arr[i][j] = sc.nextInt();
		 		}
		 		
	 			
	 		}
	 		
	 		System.out.println("Enter the target to search");
	    	 int target = sc.nextInt();
	    	 
	    	 search(arr,target);
	 		
	 		
	    	
	    }


}
