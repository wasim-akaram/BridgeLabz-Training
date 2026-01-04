package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle 
{

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) 
    {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) 
    {
    	//extra charge
        return (rentalRate * days) + 500; 
    }

    @Override
    public double calculateInsurance(int days) 
    {
        return 400 * days;
    }

    @Override
    public String getInsuranceDetails() 
    {
        return "Truck Insurance | " + getInsurancePolicyNumber();
    }
}
