package com.jUnit.testingStringUtilitymethods;

public class StringUtility 
{
	public String reverseString(String text)
	{
		String result = new StringBuilder(text).reverse().toString();
		return result;
	}
	public boolean isPalindrome(String str)
	{
		boolean result = true;
		String temp = new StringBuilder(str).reverse().toString();
		if(str.equals(temp))
		{
			result = true;
		}
		else 
			{
			result=false;
			}
		return result;
	}
	
	public String toUpperCase(String str)
	{
		String result = str.toUpperCase();
		return result;
	}

}
