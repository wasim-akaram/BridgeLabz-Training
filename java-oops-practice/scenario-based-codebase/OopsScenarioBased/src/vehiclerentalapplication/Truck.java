package vehiclerentalapplication;

class Truck extends Vehicle
{
	public Truck(String brand, String model, double baseRate)
	{
		super(brand, model, baseRate);
	}
	

	public double totalRent (int days)
	{
		return baseRate * days;
	}

}
