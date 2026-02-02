package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ExtractProgrammingLanguage 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		List <String> programminglanguagelist = new ArrayList<>();
		programminglanguagelist.add("Java");
		programminglanguagelist.add("C++");
		programminglanguagelist.add("Solidity");
		programminglanguagelist.add("Rust");
		programminglanguagelist.add("SQL");
		programminglanguagelist.add("Python");
		
		//passing the whole list top regex so that it can be matched
		String regex = String.join("|",programminglanguagelist);
		
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
