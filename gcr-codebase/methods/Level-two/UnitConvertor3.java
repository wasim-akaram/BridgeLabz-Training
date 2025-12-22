// unit converter

import java.util.*;
public class UnitConvertor3
{
	
	public static double convertFarhenheitToCelsius(double farhenheit)
	{
		return (farhenheit - 32) * 5 / 9;
	}
	public static double convertCelsiusToFarhenheit(double celsius)
	{
		return (celsius * 9 / 5) + 32;
	}
	public static double convertPoundsToKilogram(double pounds)
	{
		return pounds * 0.453592;
	}
	public static double convertKilogramToPounds(double kilogram)
	{
		return kilogram * 2.20462;
	}
	public static double convertGallonsToLiters(double gallons)
	{
		return gallons * 3.78541;
	}
	public static double convertLiterToGallon(double liters)
	{
		return liters * 0.264172;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double farhen = sc.nextDouble();
		double celsius = sc.nextDouble();
		double pounds = sc.nextDouble();
		double kilogram = sc.nextDouble();
		double gallons = sc.nextDouble();
		double liters = sc.nextDouble();
		
		System.out.println("Farhenheit to Celsius"+convertFarhenheitToCelsius(farhen));
		System.out.println("Celsius to Farhenheit"+convertCelsiusToFarhenheit(celsius));
		System.out.println("Pounds to Kilogram"+convertPoundsToKilogram(pounds));
		System.out.println("Kilogram to Pounds"+convertKilogramToPounds(kilogram));
		System.out.println("Gallons to Liters"+convertGallonsToLiters(gallons));
		System.out.println("Liter to Gallon"+convertLiterToGallon(liters));
	  
	}
}