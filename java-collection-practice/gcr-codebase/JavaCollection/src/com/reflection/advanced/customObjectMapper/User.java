package com.reflection.advanced.customObjectMapper;

public class User 
{
	private String username;
	private int points;

	@Override
	public String toString() 
	{
		return username + " has " + points + " points";
	}
}