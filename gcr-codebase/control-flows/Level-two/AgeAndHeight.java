//program to find the youngest friends among 3 Amar, Akbar, and Anthony based 
//on their ages and the tallest among the friends based on their heights


import java.util.*;
public class AgeAndHeight
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input of age
		System.out.println("Enter the ages one by one");	
		double ageOfAmar = input.nextDouble();
		double ageOfAkbar = input.nextDouble();
		double ageOfAnthony = input.nextDouble();
		
		//asking for input of height
		System.out.println("Enter the height one by one in same order");	
		double heightOfAmar = input.nextDouble();
		double heightOfAkbar = input.nextDouble();
		double heightOfAnthony = input.nextDouble();
		
		//comparing who is youngest
		if ((ageOfAmar < ageOfAkbar) && (ageOfAkbar <= ageOfAnthony) )
			{	
				System.out.println("Amar is the youngest");
			}
			
		else if(
			(ageOfAkbar < ageOfAmar) && (ageOfAmar <= ageOfAnthony) )
			{	
				System.out.println("Akbar is the youngest");
			}
			
		else if(
			(ageOfAnthony < ageOfAmar) && (ageOfAmar <= ageOfAkbar) )
			{	
				System.out.println("Anthony is the youngest");
			}
			
			
		//comparing how is the tallest
		if (
			(heightOfAmar > heightOfAkbar) && (heightOfAkbar >= heightOfAnthony) )
			{	
				System.out.println("Amar is the tallest");
			}
		else if (
			(heightOfAnthony > heightOfAkbar) && (heightOfAkbar >= heightOfAmar) )
			{	
				System.out.println("Anthony is the tallest");
			}
		else if (
			(heightOfAkbar > heightOfAnthony) && (heightOfAnthony >= heightOfAmar) )
			{	
				System.out.println("Anthony is the tallest");
			}
	}
}
			
		