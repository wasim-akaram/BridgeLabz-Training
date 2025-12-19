//program to find the bonus of 10 employees based on their years of service and the 
//total bonus amount the company Zara has to pay, along with the old and new salary.

import java.util.*;
public class Bonus
{
	public static void main(String[] args)
	{
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//creating arrays to store all the data
		double[] salary = new double[10];
		double[] year = new double[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];
		
		//taking salary and year input
		System.out.println("Enter the salary and year of experience pairwise");
		
		for(int i =0;i<10;i++)
		{
			salary[i] = sc.nextDouble();
			year[i] = sc.nextDouble();
		}
		
		//calculating bonus
		for(int i =0;i<salary.length;i++)
		{
			if(year[i]>=5)
			{
			 bonus[i] = (salary[i]/100)*5;
			}
			else
			{
			 bonus[i] = (salary[i]/100)*2;
			}
			newSalary[i] = salary[i]+bonus[i];
		}
		double bonusSum =0;
		for(int j=0; j<bonus.length; j++)
		{
			bonusSum+=bonus[j];
		}
		for(int k =0;k<10;k++)
		{
			System.out.println("The old salary is "+salary[k]+" and the new salary is "+newSalary[k]);
		}
		System.out.println("Total amount to pay in bonus "+ bonusSum);
	}
}
