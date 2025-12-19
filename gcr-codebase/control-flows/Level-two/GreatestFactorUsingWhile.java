//a program to find the  greatest factors of a number other than itself taken as user input using while

import java.util.*;
public class GreatestFactorUsingWhile
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
		
		int current = number - 1;
		
		
		
		//checking factors and displayig
		while(current >0)
		{
			if(number % current ==0)
			{System.out.println("The greatest factor is " + current);
			break;
			}
			current --;
		}
		}
	}
}