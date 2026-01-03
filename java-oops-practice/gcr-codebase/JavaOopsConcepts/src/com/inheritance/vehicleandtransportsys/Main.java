package com.inheritance.vehicleandtransportsys;

public class Main 
{
	public static void main (String args[])
	{
		Vehicle car = new Car("Toyota Land Cruiser", 280, "Petrol", "MP04WA0001",8);
		Vehicle truck = new Truck("Toyota Tundra", 180, "Petrol", "MP04WA4561", 50);
		Vehicle bike1 = new MotorCycle("Yamaha R1", 330, "Petrol", "MP04WA0001",1);
		Vehicle bike2 = new MotorCycle("RE continental GT 650 ", 210, "Petrol", "MP04QS8790",2);
		
		car.displayInfo();
		truck.displayInfo();
		bike1.displayInfo();
		bike2.displayInfo();
		
	}

}
