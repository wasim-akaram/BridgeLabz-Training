package com.generics.dynamicmarketplace;

public abstract class Products {
   public String name;
   public double value;
   
   public Products(String name , double value) {
	   this.name = name;
	   this.value = value;
   }
   public abstract void  display();
}