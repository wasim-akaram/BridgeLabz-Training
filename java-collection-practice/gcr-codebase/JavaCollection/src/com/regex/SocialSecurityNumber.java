package com.regex;

import java.util.Scanner;

public class SocialSecurityNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SSN");
		String securitynumber = sc.nextLine();
		
		String regex = "\\b\\d{3}-\\d{2}-\\d{3}\\b";
;
		
		if(securitynumber.matches(regex))
		{
			System.out.println("Its  a valid Social Security Number");

		}
		else
			System.out.println("Not a valid Social Security Number");
		
	}

}
