/*  Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days. */


import java.util.*;
public class SandeepFitnessTracker
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in );
		
		//array to store the push-ups
		int []pushupArray= new int[7];
		
		
		//loop to take pus-up 
		for(int i=0; i<7; i++)
		{
			System.out.println("\nEnter the number of push ups done today  ");
			pushupArray[i] = sc.nextInt();
			
			//displaying min max and average temperature
			
			System.out.println("\nTotal push-ups :  " + findAvgPushup(pushupArray));
			System.out.println("\nAverage Push-up :  " + ((findAvgPushup(pushupArray))/(i+1)));
			
			
			
			
		}
	}
	
	
	


	
	////method to find average temperature
	public static int findAvgPushup(int pushupArray[])
	{
		
		int sum= 0;
	
		for(int i=0; i<pushupArray.length; i++)
		{
			sum += pushupArray[i];
		
		}
		
		return sum;
	}
	
}
