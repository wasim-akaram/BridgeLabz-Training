package com.inheritance.smarthomedevice;



public class Main 
{
	public static void main(String args[])
	{
		Device d1 = new Thermostat("Heater", 1, "On", 20, 40);
	
	
	  d1.displayStatus();
	}

}
