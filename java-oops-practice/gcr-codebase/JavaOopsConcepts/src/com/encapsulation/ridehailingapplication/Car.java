package com.encapsulation.ridehailingapplication;

public class Car extends Vehicle 
{

    public Car(String id, String driver, double rate) 
    {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) 
    {
        return distance * ratePerKm;
    }
}
