 //Program to find the factorial of an integer entered by the user using for loop

import java.util.*;
public class FactorialUsingForLoop
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		//checking if the number is a positive integer
		if(number > 0)
		{	
			//finding factorial
			int factorial = 1;
			for(int i=1; i<=number; i++)
			{
			factorial = factorial * i;
			}
			//display output
			System.out.println("The factorial is " + factorial);
		}
	}
}
			