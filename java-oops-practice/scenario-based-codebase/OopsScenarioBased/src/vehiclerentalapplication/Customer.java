package vehiclerentalapplication;
 class Customer
{
	private String name;
	private String registrationNumber;
	
	//parametrized constructor
	
	public Customer (String name, String registrationNumber)
	{
		this.name = name;
		this.registrationNumber = registrationNumber;
	}
	
	//getters to get the names and registration number
	
	public String getname()
	{
		return name;
	}
	
	public String getRegistrationNumber()
	{
		return registrationNumber;
	}
	

}
