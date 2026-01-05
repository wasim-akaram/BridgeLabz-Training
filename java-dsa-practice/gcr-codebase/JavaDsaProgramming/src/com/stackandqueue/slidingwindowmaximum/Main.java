package com.stackandqueue.slidingwindowmaximum;



public class Main
{
	
	    public static void main(String[] args) 
	    {

	        int[] arr = {1, 2, -1, -3, 1, 3, 6, 7};
	        int k = 3;

	        int[] result = SlidingWindowMax.maxSlidingWindow(arr, k);

	        System.out.println("Sliding Window Maximum:");
	        for (int val : result) {
	            System.out.print(val + " ");
	        }
	    }
	
}



