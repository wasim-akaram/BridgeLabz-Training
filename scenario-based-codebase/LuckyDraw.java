/* Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid. */

import java.util.*;
public class LuckyDraw
{
	public static void main (String args[])
	{	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the total number of Customers");
		int numberOfCustomers = sc.nextInt();
		for(int i=1; i<=numberOfCustomers; i++)
		{
			System.out.println("Enter your lucky number");
		
			int luckyNumber = sc.nextInt();
			
			if((luckyNumber%3==0) && (luckyNumber%5==0))
			{
				System.out.println("You will get a discount of 25%");
			}
			else
				System.out.println("Better luck next time");
				
		}
		
		 
	}
}
