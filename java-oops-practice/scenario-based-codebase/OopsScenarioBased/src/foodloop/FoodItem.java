package foodloop;

public abstract class FoodItem 
{
	String name;
	String category;
	 public double price;
	int availability;
	
	
	public FoodItem(String name,String category, Double price, int availability)
	{
		this.name = name;
		this.category = category;
		this. price = price;
		this.availability = availability;
		
		
	}
	
	abstract void applyDiscount(double total);
	
	
	

}
