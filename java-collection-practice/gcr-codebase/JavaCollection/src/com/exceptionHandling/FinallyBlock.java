package com.exceptionHandling;
import java.util.Scanner;

public class FinallyBlock 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		try 
		{
			System.out.println("Enter the divisor and the dividend");
			int divior=sc.nextInt();
			int dividend=sc.nextInt();
			
		System.out.print("The result is " + dividend / divior);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error occured \n" + e.getMessage());
		}
		finally
		{
			System.out.println("Operation completed");
		}
	}

}
