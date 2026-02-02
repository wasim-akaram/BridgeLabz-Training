package com.exceptionHandling;

import java.util.Scanner;

public class NestedTryCatch 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			int [] arr = {17,45,80,5,25,9,32,24,76,63};
			int index=0;
			try
			{
				
				System.out.println("Enter an index to find the element");
				 index = sc.nextInt();
				System.out.println("The selected element is: " + arr[index]);
			}
			catch (IndexOutOfBoundsException as)
			{
				System.out.println("Exception occured [IOFBExc] " + as.getMessage());
			}
			System.out.println("Enter the divisor to divide");
			int divisor = sc.nextInt();
			System.out.println(arr[index]+"/"+divisor + " = "+ arr[index]/divisor );
		}
		catch(ArithmeticException ec)
		{
			System.out.println("Arithmetic exception occured: "+ ec.getMessage());
		}
	}
	
}
