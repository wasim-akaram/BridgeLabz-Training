package homenest;

public class Camera extends Device
{
	
	int pixels;
	public Camera(int deviceId, double energyUsage, String name, int pixels)
	{
		super(deviceId,  energyUsage,name);
		this.pixels= pixels;
		
	}
	

	public void displayInfo()
	{
		System.out.println("Device Id : " + deviceId + " Device name:  "+ name +" Status:  "+status + " Energy Usage:  "+ energyUsage);
		System.out.println("The " +this.name + " has a lens of  " + this.pixels + " Mega Pixel");
	}

	

}
