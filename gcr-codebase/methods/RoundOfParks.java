//program to calculate number or total rounds of a triangular park by a person running


import java.util.*;
public class RoundOfParks
{
	//method to calculate number of round to cover 5km
	public double findRound(double side1, double side2, double side3)
		{
			//calculate perimeter and total round to make
			double rounds = 5/(side1 + side2 + side3);
			
			return rounds;
		}
		
		public static void main(String[] args) 
		{
			// Create Scanner object
			Scanner sc = new Scanner(System.in);

			// Take input for side1, side2, side3
			System.out.print("Enter side1, side2, side3 :  ");
			double side1 = sc.nextDouble();
			double side2 = sc.nextDouble();
			double side3 = sc.nextDouble();
			
			//create a object of class RoundOfParks 
			RoundOfParks obj = new RoundOfParks();
			
			//call the methods
			double result = obj.findRound(side1, side2, side3);
			
			//display the value
			System.out.println("The man has to do " + result + " round");
		}
}
			