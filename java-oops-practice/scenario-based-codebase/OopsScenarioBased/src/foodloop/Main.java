package foodloop;


import java.util.Scanner;
public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//adding some food items in resturant
		
		FoodItem f1 = new NonVeg("Biryani", "Non-Veg", 250.0, 15);
		FoodItem f2 = new Veg("Shahi Panner", "Veg", 180.0, 5);
		FoodItem f3 = new Veg("Masala Panner", "Veg", 150.0, 5);
		FoodItem f4 = new Veg("Kadhai Panner", "Veg", 220.0, 7);
		FoodItem f5 = new NonVeg("Butter Chicken", "Non-Veg", 180.0, 25);
		FoodItem f6 = new NonVeg("Mutton Korma", "Non-Veg", 180.0, 10);
		
		
		Order order1 = new Order(f1);
		Order order2 = new Order(f2);
		Order order3 = new Order(f6);
		
		f1.applyDiscount(order1.placeOrder(f6));
		f4.applyDiscount(order2.placeOrder(f3));
		order3.placeOrder(f5);
		
	}

}
