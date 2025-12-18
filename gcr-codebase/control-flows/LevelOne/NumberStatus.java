//a program to check whether a number is positive, negative, or zero.

import java.util.*;
public class NumberStatus
{
	public static void main(String args[])
	{
		
		//creating scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//asking input from user
		System.out.println("Enter the number");
		//taking input from user
		int number= input.nextInt();
		
		//checking whether a number is positive, negative, or zero.
		//and displaying output
		if (number > 0)
		{
			System.out.println("The number is positive");
		}
		else if (number < 0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
		
		input.close();
	}
}
		
			