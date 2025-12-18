// program to print odd and even numbers between 1 to the number entered by the user.


import java.util.*;
public class PrintOddAndEvenNumber
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		//creating variable even odd and counting them
		int even=0, odd=0;
		for(int i=1; i<=number; i++)
		{
			if((i%2)==0)
			{ even++ ;}
			else
			{ odd++ ;}
		}
		
		//displaying output
		System.out.println("Even number between 1 and " + number +" is " + even);
		System.out.println("odd number between 1 and " + number +" is " + odd);
	}
}