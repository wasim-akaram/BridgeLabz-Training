package foodloop;

public class Veg extends FoodItem
{
	public Veg(String name,String category, Double price, int availability)
	{
		super(name, category, price, availability);
	}

	@Override
	public void applyDiscount(double total) 
	{
		System.out.println("Grand total after discount is "+ (total - (total * 0.05)));
		
	}
	
	
	
	
	
	
	
	

}
