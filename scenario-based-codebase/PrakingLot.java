//parking lote gate system

import java.util.*;
public class PrakingLot
{
	static int capacity = 100;
		static int currentStatus=56;
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people");
		int people = sc.nextInt();
		
			System.out.println("Welcome to the best parking lot in the city \nPlease enter the services you want: \n\nPark \nExit \nViewOccupancy");
			while(people >0)
		{
			
			String input = sc.next();
			input = input.toLowerCase();
			
		
			
			switch (input)
			{
				case "park":
				System.out.println(parkCar(capacity, currentStatus));
				break;
				
				case "exit":
				System.out.println(exit(currentStatus));
				break;
				
				case "viewoccupancy":
				System.out.println(viewoccupancy(capacity,currentStatus));
				break;
				
				default:
				System.out.println("You chose nothing \nHave a nice day!");
				
			}
			people--;
		}
		
	}
	
	public static String parkCar( int capacity, int currentStatus)
	{
		String result="";
		if(currentStatus == capacity)
		{
			result= "There is no space vacant \nSorry for inconvenience";
			
		}
		else
		{
			result = "You can park in. Just go and park";
			currentStatus++;
		}
		return result;
	}
	
	public static String exit( int currentStatus)
	{
		String result="";
		
			result= "Thank you for using this parking lot \nSee you next time!";
			currentStatus--;
	
		return result;
	}
	
	public static int viewoccupancy(int capacity, int currentStatus)
	{	
		return capacity - currentStatus;
	}
	
}