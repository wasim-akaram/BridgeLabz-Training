package artify;

public class DigitalArt extends Artwork
{
	public DigitalArt (String title, String artist, double price, String licenseType)
	{
		super(title,artist,  price, licenseType);
	}

	public void license (User buyer)
	{
		if(buyer.getBalance() >= getPrice())
		{
			System.out.println("art license granted for 3 months to  "+ buyer.name);
			buyer.setBalance(getPrice());
		}
		else
		{
			System.out.println("You need more money to get the license");
		}
	}
	
	
}
