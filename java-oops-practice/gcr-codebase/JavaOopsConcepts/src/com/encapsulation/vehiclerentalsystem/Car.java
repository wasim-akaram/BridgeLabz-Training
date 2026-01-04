package com.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle 
{

    public Car(String vehicleNumber, double rentalRate, String policyNumber) 
    {
        super(vehicleNumber, "Car", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) 
    {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(int days) 
    {
        return 200 * days;
    }

    @Override
    public String getInsuranceDetails() 
    {
        return "Car Insurance | " + getInsurancePolicyNumber();
    }
}
