package com.stackandqueue.circulartour;



public class Main
{
	

	    public static void main(String[] args) 
	    {

	        int[] petrol = {6, 3, 7};
	        int[] distance = {4, 6, 3};

	        int start = CircularTour.findStartingPump(petrol, distance);

	        if (start != -1)
	            System.out.println("Start at petrol pump index: " + start);
	        else
	            System.out.println("No possible circular tour");
	    }
	


}
