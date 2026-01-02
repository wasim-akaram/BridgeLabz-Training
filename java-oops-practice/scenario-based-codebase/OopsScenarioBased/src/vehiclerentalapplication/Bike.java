package vehiclerentalapplication;

class Bike extends Vehicle
{
	public Bike(String brand, String model, double baseRate)
	{
		super(brand, model, baseRate);
	}
	

	public double totalRent (int days)
	{
		return baseRate * days;
	}

}
