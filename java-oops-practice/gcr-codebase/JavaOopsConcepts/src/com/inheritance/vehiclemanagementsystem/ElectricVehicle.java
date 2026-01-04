package com.inheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle implements Rechargable 
{

	public ElectricVehicle(double maxSpeed, String model) 
	{
		super(maxSpeed,model);
	}
	@Override
	public void charge() 
	{
		System.out.println("Vehicle recharged");

	}

}
