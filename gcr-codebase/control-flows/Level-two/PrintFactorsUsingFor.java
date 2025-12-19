//a program to find the factors of a number taken as user input.

import java.util.*;
public class PrintFactorsUsingFor
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
		
		//displaying the context
		System.out.println("The number is divible by ");
		
		//checking factors and displayig
		for(int i=1; i<= number; i++)
		{
			if(number%i ==0)
			{System.out.println(i);}
		}
		}
	}
}