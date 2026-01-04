package com.encapsulation.onlinefooddeliverysystem;

public class NonVeg extends FoodItem 
{

    private static final double EXTRA_CHARGE = 50;

    public NonVeg(String name, double price, int quantity) 
    {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() 
    
    {
        return getBaseAmount() + (EXTRA_CHARGE * quantity);
    }

    @Override
    public double applyDiscount() {
        return getBaseAmount() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
