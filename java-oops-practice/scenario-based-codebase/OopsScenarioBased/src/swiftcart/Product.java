package swiftcart;

abstract public class Product 
{
	 protected String name;
	 protected double price;
	 protected String category;
	
	public Product(String name, double price, String category)
	{
		this.name= name;
		this.price=price;
		this.category=category;
	}
	
	public double getPrice() 
	{
        return price;
    }

   
    public abstract double getDiscountRate();
	

}
