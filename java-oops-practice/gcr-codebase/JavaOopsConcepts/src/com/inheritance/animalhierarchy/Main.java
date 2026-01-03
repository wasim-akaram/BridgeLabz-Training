package com.inheritance.animalhierarchy;

public class Main 
{
	public static void main (String args[])
	{
		Animal d1 = new Dog("Sheru", 7);
		Animal c1 = new Cat("Shimba", 4);
		Animal b1 = new Bird("Tweeter", 2);
		
		d1.makeSound();
		c1.makeSound();
		b1.makeSound();
	}

}
