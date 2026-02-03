package com.reflection.advanced.JSONrepresentation;

public class Main 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println(JsonSerializer.toJson(new Product()));
	}
}