package homenest;

public class Lock extends Device
{
	int strength;
	public Lock(int deviceId, double energyUsage, String name, int strength)
	{
		super(deviceId, energyUsage,name);
		this.strength = strength;
		
	}

	public void displayInfo()
	{
		System.out.println("Device Id : " + deviceId + " Device name:  "+ name +" Status:  "+status + " Energy Usage:  "+ energyUsage);
		System.out.println("The " +this.name + " can witstand a force of   " + this.strength + " N");
	}


	

}
