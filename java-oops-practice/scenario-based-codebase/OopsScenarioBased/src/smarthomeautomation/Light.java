package smarthomeautomation;

class Light extends Appliance 
{

    public Light() 
    {
        super(90);   
    }

    public Light(int powerUsage) 
    {
        super(powerUsage);
    }

   
    public void turnOn() 
    {
        setPowerOn(true);
        System.out.println("Light is ON ");
    }

    
    public void turnOff() 
    {
        setPowerOn(false);
        System.out.println("Light is OFF");
    }
}
