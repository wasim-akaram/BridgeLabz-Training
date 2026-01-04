package com.encapsulation.onlinefooddeliverysystem;

public abstract class FoodItem implements Discount
{

    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) 
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

   
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails()
    {
        System.out.println("\nItem Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
    }

    // Encapsulation
    protected double getBaseAmount()
    {
        return price * quantity;
    }
}
