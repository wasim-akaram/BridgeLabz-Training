//program calculate the wind chill temperature given the temperature and wind speed

import java.util.*;
public class WindchillCalculator
{
	public double calculateWinChill(double temp, double windspeed)
	{
		double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75)
		* (Math.pow(windspeed, 0.16));
		
		return windChill;
	}
	
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the temperature and wind speed");
		double temp=sc.nextDouble();
		double windspeed=sc.nextDouble();
		
		//creating class object and calling method
		
		WindchillCalculator windchillCalculator= new WindchillCalculator();
		double result = windchillCalculator.calculateWinChill(temp, windspeed);
		
		
		//display result
		System.out.println( result);
	}
}
		