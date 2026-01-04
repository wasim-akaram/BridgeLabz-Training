package com.encapsulation.onlinefooddeliverysystem;

public class VegItem extends FoodItem 
{

    public VegItem(String name, double price, int quantity)
    {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() 
    {
        return getBaseAmount();
    }

    @Override
    public double applyDiscount() {
        return getBaseAmount() * 0.10; 
    }

    @Override
    public String getDiscountDetails() 
    {
        return "Veg Item Discount: 10%";
    }
}
