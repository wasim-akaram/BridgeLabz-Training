//program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.*;
public class SimpleInterest
{
	//method to calculate Simple interest
	public double simpleInterestCalculator(double principal, double rate, double time)
		{
			//calculate Simple interest
			double simpleInterest = (principal * rate * time)/100;
			
			return simpleInterest;
		}
		
		public static void main(String[] args) 
		{
			// Create Scanner object
			Scanner sc = new Scanner(System.in);

			// Take input for principal, rate, time
			System.out.print("Enter principal, rate, time :  ");
			double principal = sc.nextDouble();
			double rate = sc.nextDouble();
			double time = sc.nextDouble();
			
			//create a simple interest object
			SimpleInterest interest = new SimpleInterest();
			
			//call the method to calculate Smple Interest
			double result = interest.simpleInterestCalculator(principal, rate, time);
			
			//display result
			System.out.println("The simple interest is : " + result);
		}
}