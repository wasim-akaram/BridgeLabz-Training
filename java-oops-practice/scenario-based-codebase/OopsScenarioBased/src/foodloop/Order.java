package foodloop;

import java.util.ArrayList;

public class Order implements IOrderable
{
	public FoodItem foodItem ;
	ArrayList<FoodItem> order = new ArrayList<>();
	double total = 0;
	
	public Order(FoodItem foodItem)
	{
		this. foodItem = foodItem;
	
	}
	
	
	public double addItem(FoodItem food)
	{
		order.add(food);
		total += food.price;
		
		return total;
		
	}
	public double placeOrder(FoodItem food)
	{
		if(food.availability++ > 0)
		{
			System.out.println("order placed! " + food.name + " added to orders");
			order.add(food);
			total += food.price;
			System.out.println("Total amount " + total);
			
		}
		
		else
		{
			System.out.println("sorry! Item not  available");
		}
		
		return total;
	}
	
	public double cancelOrder(FoodItem food)
	{
		if(order.contains(food))
		{
			order.remove(food);
			System.out.println("Your "+ food.name + " was removed from your order");
			food.availability--;
			total-= food.price;
			
		}
		else
		{
			System.out.println("Given order not present");
		}
		return total;
	}



	
	
	
	
	
	

}
