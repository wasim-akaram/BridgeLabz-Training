package homenest;

public class Thermostat extends Device
{
	int maxtemp;
	
	public Thermostat(int deviceId, double energyUsage, String name, int maxtemp)
	{
		super(deviceId,  energyUsage,name);
		this.maxtemp=maxtemp;
	}
	public void displayInfo()
	{
		System.out.println("Device Id : " + deviceId + " Device name:  "+ name +" Status:  "+status + " Energy Usage:  "+ energyUsage);
		System.out.println("The maximum temperature of " +this.name + " is  " + this.maxtemp + " *C");
	}


	

}
