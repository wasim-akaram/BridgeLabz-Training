package com.encapsulation.ridehailingapplication;

public class Auto extends Vehicle 
{

    private static final double BASE_FARE = 30;

    public Auto(String id, String driver, double rate) 
    {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) 
    {
        return BASE_FARE + (distance * ratePerKm);
    }
}
