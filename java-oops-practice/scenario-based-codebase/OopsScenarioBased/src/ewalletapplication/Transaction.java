package ewalletapplication;

class Transaction 
{
	private String type;
	private double amount;
	
	//constructor
	public Transaction (String type, double amount)
	{
		this.type = type;
		this.amount = amount;
	}
	
	public String toString()
	{
		return type +" : Rs " + amount;
	}

}
