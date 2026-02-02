package com.regex;

import java.util.Scanner;
public class ValidateCreditCardNumber 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the credit card number");
		String creditcardnumber = sc.nextLine();
		
		String regex = "[4-5]\\d{15}";
		
		if(creditcardnumber.matches(regex))
		{
			System.out.printf("Its a valid credit card number ");
			String regex2 = "[4]\\d{15}";
			if(creditcardnumber.matches(regex2))
			{
				System.out.println("Its VISA");
			}
			else
			{
				System.out.println("Its Master Card");
			}

		}
		else
			System.out.println("Its not a valid crfedit card number");
		
	}

}
