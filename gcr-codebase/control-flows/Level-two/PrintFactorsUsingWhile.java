//a program to find the factors of a number taken as user input using while

import java.util.*;
public class PrintFactorsUsingWhile
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
		int i=1;
		
		//displaying the context
		System.out.println("The number is divible by ");
		
		//checking factors and displayig
		while(i<=number)
		{
			if(number%i ==0)
			{System.out.println(i);}
			i++;
		}
		}
	}
}