package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPriceValue 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		String regex = "\\$?\\d+(\\.\\d{2})?";

		
		Pattern pattern = Pattern.compile(regex);
		
		System.out.println("Enter the Text");
		String text = sc.nextLine();
		
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
	}
}
