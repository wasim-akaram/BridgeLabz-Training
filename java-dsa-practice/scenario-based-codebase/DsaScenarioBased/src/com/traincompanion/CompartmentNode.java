package com.traincompanion;

public class CompartmentNode 
{
	int compartmentNumber;
	String name;
	String feature;
	CompartmentNode next ,prev;
	
	public CompartmentNode(int compartmentNumber, String name, String feature)
	{
		this.compartmentNumber = compartmentNumber;
		this.name = name;
		this.feature = feature;
		this.next = this. prev = null;
	}

}
