package vehiclerentalapplication;

class Car extends Vehicle
{
	public Car(String brand, String model, double baseRate)
	{
		super(brand, model, baseRate);
	}
	

	public double totalRent (int days)
	{
		return baseRate * days;
	}

}
