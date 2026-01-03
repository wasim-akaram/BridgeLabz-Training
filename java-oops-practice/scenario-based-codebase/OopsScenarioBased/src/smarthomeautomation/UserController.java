package smarthomeautomation;

class UserController 
{

    public void operateDevice(Controllable device, boolean state) 
    {
        if (state)
        {
        	device.turnOn();
        }
        else
        {
        	device.turnOff();
        }
    }

    public void compareEnergy(Appliance a1, Appliance a2) 
    {

    	
        if (a1.getPowerUsage() > a2.getPowerUsage())
            System.out.println("First appliance consumes more energy");
        else if (a1.getPowerUsage() < a2.getPowerUsage())
            System.out.println("Second appliance consumes more energy");
        else
            System.out.println("Both appliances consume equal energy");
    }
}
