package com.inheritance.vehicleandtransportsys;

class Truck extends Vehicle 
{
	int maxLoad;
	
	public Truck(String name, int maxSpeed, String fuelType, String registrationNumber, int maxLoad)
	{
		super(name, maxSpeed, fuelType, registrationNumber);
		this.maxLoad= maxLoad;
	}
	
	//override
	public void displayInfo()
	{	 super.displayInfo();
		System.out.println("Max Load Capacity: "+ maxLoad + "Tonnes");
		
	}

	
	

}
