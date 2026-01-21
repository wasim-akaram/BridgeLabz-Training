package com.generics.smartwarehousemanagement;

public class Electronics extends Product
{
     public String name;
     public double price;
     public double rating;
     
     public Electronics(String name, double price, double rating)
     {
    	 this.name = name;
    	 this.price= price;
    	 this.rating = rating;
     }
     
     @Override
    public String toString() 
     {
    
    	return "\nProduct Name : "+this.name+" | Product Price : "+this.price+" | Product Rating : "+this.rating+" | Product Type : Electronic";
    }
}