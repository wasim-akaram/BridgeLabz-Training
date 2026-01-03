package com.inheritance.vehicleandtransportsys;

public class Vehicle 
{
	String name;
	int maxSpeed;
	String fuelType;
	String registrationNumber;
	
	Vehicle(String name, int maxSpeed, String fuelType, String registrationNumber)
	{
		this.name = name;
		this.fuelType = fuelType;
		this.maxSpeed= maxSpeed;
		this.registrationNumber= registrationNumber;
		
	}
	public void displayInfo()
	{
		System.out.println("\nVehicle Name: "+ name);
		System.out.println("Registration : " + registrationNumber );
		System.out.println("fuel used: "+ fuelType);
		System.out.println("Goes upto "+ maxSpeed +" Km/h");
	}

}
