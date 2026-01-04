package com.inheritance.smarthomedevice;


public class Device 
{
	String name;
	int deviceId;
	String status;
	
	public Device(String name, int deviceId, String status)
	{
		this.name = name;
		this.deviceId = deviceId;
		this.status = status;
	}
	
	public void displayStatus()
	{
		System.out.println("\n"+ deviceId +" "+ name + " is "+ status);
	}
	

}
