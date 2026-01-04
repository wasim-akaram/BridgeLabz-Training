package com.encapsulation.ridehailingapplication;



public abstract class Vehicle implements CurrentLocation
{

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    // Encapsulated GPS data
    private String currentLocation = "Unknown";

    public Vehicle(String vehicleId, String driverName, double ratePerKm) 
    {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() 
    {
        System.out.println("\nVehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate/Km    : " + ratePerKm);
    }

  
    @Override
    public String getCurrentLocation() 
    {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) 
    {
        this.currentLocation = newLocation;
    }
}
