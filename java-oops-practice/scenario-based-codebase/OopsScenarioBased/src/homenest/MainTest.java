package homenest;


public class MainTest 
{
	public static void main(String []args)
	{
		Device d1 = new Light(1, 150.0,"CFL", 100);
		Device d2 = new Lock(2,200, "Gate Lock",10000);
		Device d3 = new Camera(3,50,"Hawk's Eye",12);
		Device d4 = new Thermostat(4,250,"Black And Decker thermostat", 56);
		
		d4.displayInfo();
		d4.reset();
		d4.displayInfo();
		
		
		d2.turnOn();
		d3.turnOff();
		
		d1.turnOn();
		d1.displayInfo();
		d1.reset();
		d1.displayInfo();
		
	}

}
