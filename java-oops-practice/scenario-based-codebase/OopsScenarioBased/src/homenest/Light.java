package homenest;

public class Light extends Device
{
	int operatingPower;
	
	public Light(int deviceId,  double energyUsage, String name, int operatingPower)
	{
		super(deviceId,  energyUsage,name);
		this.operatingPower = operatingPower;
		
	}

	public void displayInfo()
	{
		System.out.println("Device Id : " + deviceId + " Device name:  "+ name +" Status:  "+status + " Energy Usage:  "+ energyUsage);
		System.out.println("The " +this.name + " operates on " + this.operatingPower + " Watts");
	}

}
