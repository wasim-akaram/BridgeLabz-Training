package com.constructor.levelOne;

class Product 
{
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) 
    {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance Method
    public void displayProductDetails() 
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method
    public static void displayTotalProducts() 
    {
        System.out.println("Total Products Created: " + totalProducts);
    }

    
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 990.00);
        Product product2 = new Product("Smartphone", 499.00);

        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.displayTotalProducts();
    }
}