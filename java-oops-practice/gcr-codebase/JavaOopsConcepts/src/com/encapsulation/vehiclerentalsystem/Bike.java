package com.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle 
{

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) 
    {
        super(vehicleNumber, "Bike", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) 
    {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(int days) 
    {
        return 100 * days;
    }

    @Override
    public String getInsuranceDetails() 
    {
        return "Bike Insurance | " + getInsurancePolicyNumber();
    }
}
