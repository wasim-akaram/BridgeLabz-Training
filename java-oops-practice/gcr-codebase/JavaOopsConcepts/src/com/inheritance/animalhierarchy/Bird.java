package com.inheritance.animalhierarchy;

class Bird extends Animal
{
	public Bird(String name, int age)
	{
		super(name,age);
	}
	
	public void makeSound()
	{
		System.out.println("Bird sings");
	}

}
