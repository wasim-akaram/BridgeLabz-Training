package smarthomeautomation;

class Fan extends Appliance 
{

    public Fan() 
    {
        super(110);
    }

    public Fan(int powerUsage) 
    {
        super(powerUsage);
    }

    
    public void turnOn() 
    {
        setPowerOn(true);
        System.out.println("Fan swtiched ON");
    }

   
    public void turnOff()
    {
        setPowerOn(false);
        System.out.println("Fan switched OFF");
    }
}

