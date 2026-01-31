package com.exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
public class UncheckedException {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the dividend and the divisor");
			int dividend = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println(dividend/divisor);
		}
		catch (ArithmeticException ar)
		{
			System.out.println("Exception occured \n"+ ar.getMessage());
			
		}
		catch(InputMismatchException inmexc)
		{
			System.out.println("Input mismatched and exception occured \n"+ inmexc.getMessage());
		}
	}

}
