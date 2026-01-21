package com.generics.dynamicmarketplace;

import java.util.ArrayList;

public class Catalog <T extends Products>{
     ArrayList<T> arr = new ArrayList<>();
     public void addProduct(T product) {
    	 if(arr.contains(product)) {
    		 System.out.println("Product Already Exists");
    		 return;
    	 }
    	 arr.add(product);
     }
     
     public void applyDiscount(T product,double percentage) {
    	 if(!arr.contains(product)) {
    		 System.out.println("The Product does not Exists");
    		 return;
    	 }
    	  for (T p : arr) {
              if (p.name.equalsIgnoreCase(product.name)) {
                  discount(p, percentage);
              }
          }
     }
     public void discount(T p,double percentage) {
    	 double dis = (p.value/100)*percentage;
    	 double newprice = p.value - dis;
    	 System.out.println("\n-----Discount------");
    	 System.out.println("Product Name : "+p.name);
    	 System.out.println("Price        : "+p.value);
    	 System.out.println("Discount     : "+dis);
    	 System.out.println("Final Amount : "+newprice);
    	 p.value = newprice;
    	
     }
     public void displayCatalog() {
    	 arr.stream().forEach(x->x.display());
     }
}
