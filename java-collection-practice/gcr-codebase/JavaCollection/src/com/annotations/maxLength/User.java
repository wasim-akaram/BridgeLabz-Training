package com.annotations.maxLength;

public class User 
{
	@MaxLength(10)
	String username;

	public User(String username) 
	{
		this.username = username;
	}
}