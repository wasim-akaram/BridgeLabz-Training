package com.generics.dynamicmarketplace;

public class Clothes extends Products{

	public Clothes(String name, double value) {
		super(name, value);
	
	}

	@Override
	public void display() {
		System.out.println("\n-------Cloth Details-------");
		System.out.println("Book Name : "+this.name);
		System.out.println("Price     : "+this.value);
	}

}