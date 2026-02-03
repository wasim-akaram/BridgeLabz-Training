package com.reflection.basic;

public class Person 
{
	private String name = "Vishal Singh";
	private int age = 21;

	public Person() {
		System.out.println("Person constructor");
	}

	private void displayInfo() 
	{
		System.out.println("Name: " + name + ", Age: " + age);
	}

}