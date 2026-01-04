package com.inheritance.smarthomedevice;

class Thermostat extends Device
{
	int mintemp; 
	int maxtemp;
	
	public Thermostat(String name, int deviceId, String status, int mintemp, int maxtemp)
	{
		super(name, deviceId, status);
		this.mintemp = mintemp;
		this.maxtemp = maxtemp;
	}
	
	public void displayStatus()
	{
		super.displayStatus();
		System.out.println("Min temp is "+ mintemp + " C and Max temp is "+ maxtemp +" C" );
	}

}
