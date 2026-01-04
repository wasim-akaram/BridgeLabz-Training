package com.encapsulation.ecommerceplatform;

public abstract class Product {

    // Encapsulation: private fields
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

   
    public double getFinalPrice() {
        double tax = 0;

        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
        }

        return price + tax - calculateDiscount();
    }

    // Display method
    public void displayDetails() {
        System.out.println("\nProduct ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Base Price : " + price);
        System.out.println("Discount   : " + calculateDiscount());
        System.out.println("Final Price: " + getFinalPrice());
        
    }

    // Getters & Setters (Encapsulation)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
