package com.traincompanion;

public class Main 
{
	public static void main(String args[])
	{
		CompartmentLinkedList list = new CompartmentLinkedList();
		
		list.addCompartment(1, "EOG", "Parcel Van");
		list.addCompartment(2, "Sleeper", "Bed");
		list.addCompartment(3,"Sleeper", "Bed");
		list.addCompartment(4,"Sleeper", "Bed");
		list.addCompartment(5,"Pantry car", "food & water");
		list.addCompartment(6,"AC", "Air conditioner");
		list.addCompartment(7,"AC 1", "Accomodity and wifi");
		list.addCompartment(8,"General Sitting", "Seat");
		
		
		list.iterateBackword();
		list.iterateForward();
		
	}

}
