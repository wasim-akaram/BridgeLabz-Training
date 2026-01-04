package com.encapsulation.ridehailingapplication;

public class Bike extends Vehicle 
{

    public Bike(String id, String driver, double rate) 
    {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) 
    {
        return (distance * ratePerKm) * 0.9; 
    }
}
