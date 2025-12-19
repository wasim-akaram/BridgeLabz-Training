//program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, 
//loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 
//print "Buzz", and for multiples of both print "FizzBuzz".

import java.util.*;
public class FizzBuzzUsingWhile
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		int current = number;
		
		//checkin if it is positive
		if(number > 0 )
		{	
			//using while loop an d priting as stated
			while( current >0)
			{
				//checking if the number is multiple of 3 or 5
				if(number % 3 ==0)
				{
					System.out.println("Fizz");
				}
				else if(number % 5 ==0)
				{
					System.out.println("Buzz");
				}
				else if((number % 5 ==0) && (number % 3 ==0))
				{
					System.out.println("FizzBuzz");
				}
				else
					System.out.println(number);
				
				//updating current
				current--;
			}	
		}
	}
}