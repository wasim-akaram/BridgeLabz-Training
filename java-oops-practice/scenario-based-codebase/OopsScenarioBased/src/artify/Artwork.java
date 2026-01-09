package artify;

public class Artwork implements IPurchasable
{
	private String title;
	private String artist;
	private  double price;
	private String licenseType;
	
	public Artwork(String title, String artist, double price, String licenseType)
	{
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
	}
	
//	public Artwork(double price)
//	{
//		super();
//	}
	
	
	//getters
	public String getTitle()
	{
		return title;
	}
	public String getartist()
	{
		return artist;
	}
	public double getPrice()
	{
		return price;
	}
	public String getLicense()
	{
		return licenseType;
	}
	
	public void purchase(User buyer)
	{
		if(buyer.getBalance() >= price)
		{
			System.out.println(buyer.name + " bought " + title);
		}
		else
		{
			System.out.println("Balance is too low");
		}
	}
	
	public void license (User buyer)
	{
		if(buyer.getBalance() >= price)
		{
			System.out.println("art license granted forever to  "+ buyer.name);
			buyer.setBalance(price);
		}
		else
		{
			System.out.println("You need more money to get the license");
		}
	}
	
	


}
