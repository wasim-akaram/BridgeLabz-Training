//Create a UnitConvertor utility class similar to the one shown in the notes to do the following.
//Please define static methods for all the UnitConvertor class methods.

import java.util.*;
public class UnitConvertor2
{
	
	//method to convert yard to feet
	public static double convertYardsToFeet(double yards)
	{
		return yards*3;
	}
	
	//method to convert feet to yards
	public static double convertFeetToYard(double feet)
	{
		return feet*0.333333;
	}
	
	//method to convert meter to inch
	public static double convertMeterToInche(double meters)
	{
		return meters*39.3701;
	}
	
	//method to convert inch to meter
	public static double convertInchesToMeter(double inches)
	{
		return inches*0.0254;
	}
	public static double convertInchesToCentimeter(double inches)
	{
		return inches*2.54;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double yards = sc.nextDouble();
		double feet = sc.nextDouble();
		double meter= sc.nextDouble();
		double inche = sc.nextDouble();
		
		System.out.println("The yard to feet "+convertYardsToFeet(yards));
		System.out.println("The feet to yard "+convertFeetToYard(feet));
		System.out.println("The meter to inches "+convertMeterToInche(meter));
		System.out.println("The inches to meter "+convertInchesToMeter(inche));
		System.out.println("The inches to centimeter "+convertInchesToCentimeter(inche));
		
	}
}