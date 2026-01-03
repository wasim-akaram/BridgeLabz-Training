package com.inheritance.vehicleandtransportsys;

class Car extends Vehicle 
{
	int seatCapacity;
	
	public Car(String name, int maxSpeed, String fuelType, String registrationNumber, int seatCapacity)
	{
		super(name, maxSpeed, fuelType, registrationNumber);
		this.seatCapacity = seatCapacity;
	}
	
	//override
	public void displayInfo()
	{	 super.displayInfo();
		System.out.println("seatCapacity: "+ seatCapacity);
		
	}

}
