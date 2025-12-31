/* Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation. */

import java.util.*;
public class BusRouteDistanceTracker
{
	public static void main (String args[])
	{	
		Scanner sc = new Scanner(System.in);
		for(int bustop =1; bustop <21; bustop++)
		{
			System.out.println("You reached the stop No: " + bustop + " Do you want to get off? (y/n)");
			char ch= sc.next().charAt(0);
			if(ch=='y')
			{
				System.out.println("You travelled " + (bustop * 6) + "km");
				break;
			}
			
		}
		
	}
}