//a program to count down the number from the user input value to 1 using a while loop for a rocket launch

import java.util.*;
public class CountDownWithWhile
{	
	public static void main( String args[])
	{
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//asking user for input
		System.out.println("Enter the current start ");
		int time= input.nextInt();
		
		//checking the time and displaying the countdown
		while( time >= 0)
		{
			System.out.println(time);
			time--;
		}
	}
}
		
		
		 