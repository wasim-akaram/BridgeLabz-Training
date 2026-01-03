package com.inheritance.vehicleandtransportsys;


class MotorCycle extends Car 
{
	public MotorCycle(String name, int maxSpeed, String fuelType, String registrationNumber, int seatCapacity)
	{
		super(name, maxSpeed, fuelType, registrationNumber, seatCapacity);
		
	}
	
	//override
	public void displayInfo()
	{	 super.displayInfo();
		System.out.println("It is the fastest of all but carries minimum load ");
		
	}

}
