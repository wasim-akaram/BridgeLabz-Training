package homenest;

public class Device implements IControllable
{
	int deviceId;
	String name;
	String status;
	double energyUsage;
	
	public Device(int deviceId, double energyUsage, String name)
	{
		this.deviceId = deviceId;
		this.status = "off";
		this.energyUsage = energyUsage;
		this.name = name;
		
	}
	public void displayInfo()
	{
		System.out.println("Device Id : " + deviceId + " Device name:  "+ name +" Status:  "+status + " Energy Usage:  "+ energyUsage);
	
		
	}
	public void turnOn()
	{
		if(this.status.equals("on"))
		{
			System.out.println("It's already on");
		}
		else
		{
			System.out.println(this.name + " turned on");
			status= "on";
		}
	}
	
	public void turnOff()
	{
		if(this.status.equals("off"))
		{
			System.out.println("It's already off");
		}
		else
		{
			System.out.println(this.name + " turned off");
			status= "off";
		}
	}
	
	public void reset()
	{
		System.out.println("The " + this.name + " was reset.");
		status = "on";
	}

}
