//program to check if a number is an Abundant Number.
//An abundant number is an integer in which the sum of all the 
//divisors of the number is greater than the number itself


import java.util.Scanner;
public class AbundantNumber
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int sumOfDivisor=0;
		
		for(int i=1; i<number; i++)
		{
			if(number % i ==0)
			{
				sumOfDivisor+=i;
			}
		}
		
		//displaying the result
		if(sumOfDivisor > number)
		{
			System.out.println("Abundant Number");
		}
		else
		{
			System.out.println("Not an Abundant Number");
		}
	}
}
		