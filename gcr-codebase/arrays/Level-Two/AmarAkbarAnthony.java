//program to find the youngest friends among 3 Amar, Akbar, and Anthony based 
//on their ages and the tallest among the friends based on their heights


import java.util.*;
public class AmarAkbarAnthony
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		double [] age = new double[3];
		double [] height = new double[3];
		
		//asking for input of age
		System.out.println("Enter the ages one by one");
			for(int i=0; i<3; i++)
			{
				age[i] = input.nextDouble();
			}
		
		
		//asking for input of height
		System.out.println("Enter the height one by one in same order");	
		for(int i=0; i<3; i++)
			{
				height[i] = input.nextDouble();
			}
		
		//comparing who is youngest
		if ((age[0] < age[1]) && (age[0] < age[2]) )
			{	
				System.out.println("Amar is the youngest");
			}
			
		else if(
			(age[1] < age[0]) && (age[1] < age[2]) )
			{	
				System.out.println("Akbar is the youngest");
			}
			
		else if(
			(age[2] < age[0]) && (age[2] < age[1]) )
			{	
				System.out.println("Anthony is the youngest");
			}
			
			
		//comparing how is the tallest
		if (
			(height[0] > height[1]) && (height[0] > height[1]) )
			{	
				System.out.println("Amar is the tallest");
			}
		else if (
			(height[1] > height[0]) && (height[1] > height[2]) )
			{	
				System.out.println("Akbar is the tallest");
			}
		else if (
			(height[2] > height[0]) && (height[2] > height[1]) )
			{	
				System.out.println("Anthony is the tallest");
			}
	}
}
			
		