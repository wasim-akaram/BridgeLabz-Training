//program to find the BMI of a person


import java.util.Scanner;
public class MayaFitnessBMIcalculator
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the weight in kg");
		double weight = sc.nextDouble();
		System.out.println("Enter the height in cm");
		double height = sc.nextDouble();
		
		// convert height to meter
		height=height/100.0;
		
		
		//calculating BMI
		double bmi= weight / (height * height);
		
		//displaying status
		if( bmi >=40)
		{
			System.out.println("Status : Obese");
		}
		else if( bmi >= 25 && bmi < 40)
		{
			System.out.println("Status : Overweight");
		}
		else if( bmi >= 18.5 && bmi < 25)
		{
			System.out.println("Status : Normal");
		}
		else if( bmi >= 18.4)
		{
			System.out.println("Status : Underweight");
		}
	}
}
		
		