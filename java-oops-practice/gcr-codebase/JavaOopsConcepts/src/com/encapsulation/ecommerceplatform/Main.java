package com.encapsulation.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(201, "Laptop", 60000));
        products.add(new Clothing(202, "Jacket", 3000));
        products.add(new Groceries(203, "Rice Bag", 1200));

        
        for (Product product : products) 
        {
        	
            product.displayDetails();
        }
    }
}
