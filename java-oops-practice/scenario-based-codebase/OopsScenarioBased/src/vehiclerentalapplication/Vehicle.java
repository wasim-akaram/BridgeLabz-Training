package vehiclerentalapplication;

abstract class Vehicle implements Rentable
{
	protected String name;
	protected String model;
	protected double baseRate;
	
	public Vehicle(String name, String model, double baseRate)
	{
		this.name = name;
		this.model = model;
		this.baseRate = baseRate;
	}
	
	public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
	

}
