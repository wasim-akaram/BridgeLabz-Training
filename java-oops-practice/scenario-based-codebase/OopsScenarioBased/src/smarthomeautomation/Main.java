package smarthomeautomation;

public class Main
{

	
    public static void main(String[] args) 
    {
    	
    	

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        UserController controller = new UserController();

       
        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        // Compare energy usage
        controller.compareEnergy(light, fan);
        controller.compareEnergy(ac, fan);

        controller.operateDevice(ac, false);
    }
}
