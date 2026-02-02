package com.exceptionHandling;
public class ExceptionTransfer
{
	public static void method1()
	{
		System.out.println(10/0);
	}
	
	
	
	public static void method2()
	{
		method1();
	}
	
	public static void main(String args[])
	{
		try
		{
			method2();
			
		}
		catch(ArithmeticException ec)
		{
			System.out.println("Arithmetic exception occured: " + ec.getMessage());
		}
	}

}
