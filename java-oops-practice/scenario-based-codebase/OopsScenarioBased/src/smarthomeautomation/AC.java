package smarthomeautomation;

class AC extends Appliance 
{

	
    public AC() 
    {
        super(1500);
    }

    public AC(int powerUsage) 
    {
        super(powerUsage);
    }

   
    public void turnOn() 
    {
        setPowerOn(true);
        System.out.println("AC switched ON");
    }

   
    public void turnOff() 
    {
        setPowerOn(false);
        System.out.println("AC switched OFF");
    }
}
