//program to find the bonus of employees based on their years of service.


import java.util.*;
public class BonusCalculator
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input salary and year of service
		System.out.println("Enter the salary  and year of service");
		double salary = input.nextDouble();
		double serviceYear = input.nextDouble();
		double bonus =0;
		
		//finding bonus
		if(serviceYear>5)
		{
			bonus = salary * 0.05;
		}
		
		//display output
		System.out.println(bonus) ;
	}
}
		
		
		
