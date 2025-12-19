//a program to find the  greatest factors of a number other than itself taken as user input using for

import java.util.*;
public class GreatestFactorUsingFor
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		//checking if its positive
		if (number>0)
		{

		//checking factors and displayig
		for(int current = number - 1; current>0; current--)
		{
			if(number % current ==0)
			{System.out.println("The greatest factor is " + current);
			break;
			}
		
		}
		}
	}
}