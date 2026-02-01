package com.exceptionHandling;

import java.util.*;
public class CustomException extends Exception
{
	public CustomException(String message) {
		super(message);
		
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		try
		{
			System.out.println("Enter the age to validate");
			int age = sc.nextInt();
			validateage(age);
		}
		catch (CustomException exp)
		{
			System.out.println("Custom exception caught: " + exp.getMessage());
		}
	}
	public static void validateage(int age) throws CustomException
	{
		if(age<18)
		{
			throw new CustomException("Age is lesser than 18");
		}
	}

}
