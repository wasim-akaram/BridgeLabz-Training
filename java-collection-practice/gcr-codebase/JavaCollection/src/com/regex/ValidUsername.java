package com.regex;

public class ValidUsername 
{
	public static void main(String[] args) {

	        String[] usernames = {"user_123", "123user", "us"};

	        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

	        for (String username : usernames)
	        {
	            if (username.matches(regex)) 
	            {
	                System.out.println(username + "  Valid");
	            } 
	            else 
	            {
	                System.out.println(username + "  Invalid");
	            }
	        }
	    }
	


}
