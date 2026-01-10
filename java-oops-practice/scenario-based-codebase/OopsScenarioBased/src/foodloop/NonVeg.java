package foodloop;

public class NonVeg extends FoodItem
{
	public NonVeg(String name,String category, Double price, int availability)
	{
		super(name, category, price, availability);
	}
	
	public void applyDiscount(double total) 
	{
		System.out.println("Grand total after discount is "+ (total - (total * 0.05)));
		
	}
	
	
	

}
