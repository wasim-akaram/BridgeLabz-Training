package smarthomeautomation;

abstract class Appliance implements Controllable
{

    private boolean powerOn;      
    private int powerUsage;       

    
    
    // Default constructor
    public Appliance() 
    {
        this.powerUsage = 100;
        
    }

    // power setting
    public Appliance(int powerUsage) 
    {
        this.powerUsage = powerUsage;
    }

    protected void setPowerOn(boolean state)
    {
        this.powerOn = state;
    }

    public boolean isPowerOn() 
    {
        return powerOn;
    }

    public int getPowerUsage() 
    {
        return powerUsage;
    }
}
