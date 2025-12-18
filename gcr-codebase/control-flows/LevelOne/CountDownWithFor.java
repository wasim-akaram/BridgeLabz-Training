//a program to count down the number from the user input value to 1 using a for loop for a rocket launch

import java.util.*;
public class CountDownWithFor
{	
	public static void main( String args[])
	{
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//asking user for input
		System.out.println("Enter the current start ");
		int time= input.nextInt();
		
		//checking the time and displaying the countdown
		for(int count=time; count >=0; count--)
		{
			System.out.println(count);
		
		}
	}
}
		
		
		 