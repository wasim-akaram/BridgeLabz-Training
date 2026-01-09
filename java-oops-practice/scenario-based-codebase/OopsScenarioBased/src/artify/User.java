package artify;

public class User 
{
	String name;
	
	private double walletBalance;
	
	public User(String name, double walletBalance)
	{
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	//getter for balance
	public double getBalance()
	{
		return walletBalance;
	}
	
	//setter for balance
	
	public double setBalance(double amount)
	{
		walletBalance -= amount;
		return walletBalance;
		
	}
	

}
