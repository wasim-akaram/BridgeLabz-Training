package medistore;

import java.time.*;


public class Medicine 
{
	private String name;
	private double price;
	private  LocalDate expiryDate;
	private int quantity;
	
	
	
	//create a construictor
	
	
	
	public Medicine(String name, double price, LocalDate expiryDate)
	{
		this(name, price,expiryDate, 100);
	}
	
	
	
	public Medicine(String name, double price, LocalDate expiryDate, int quantity)
	{
		this.name = name;
		this.price= price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public LocalDate getExpiryDate()
	{
		return expiryDate;
	}
	
	public double getQuantity()
	{
		return quantity;
	}
	
	
	public void addStock(int quantity) 
	{
        if (quantity > 0) 
        {
            quantity += quantity;
        }
    }
	
	
	private double applyDiscount(double total)
	{
		if(total > 1000)
		{
			return total * 0.90;
		}
		return total;
	}
	
	
	
	
	
    public double sell(int units)
    {
        if (units > quantity) 
        {
           throw new IllegalArgumentException ("Insufficient stock");
        }
       quantity -= units;
       double totalPrice = units * price;
       
       return applyDiscount(totalPrice);
    }
    
  
    
    
}
	
	
	


