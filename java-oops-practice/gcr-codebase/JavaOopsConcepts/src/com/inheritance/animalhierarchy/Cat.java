package com.inheritance.animalhierarchy;

class Cat extends Animal
{
	public Cat(String name, int age)
	{
		super(name,age);
	}
	
	public void makeSound()
	{
		System.out.println("Cat meows");
	}

}
