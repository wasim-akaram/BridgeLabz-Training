package com.encapsulation.vehiclerentalsystem;

public abstract class Vehicle implements Insurance
{

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    // Encapsulated insurance data
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) 
    {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }


    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails() 
    {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Type           : " + type);
        System.out.println("Rental Rate    : " + rentalRate + " per day");
    }

    // Encapsulation
    protected String getInsurancePolicyNumber() {
        return "Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
