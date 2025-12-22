//program to find the sum of n natural numbers using recursive method

import java.util.*;
public class NaturalNumber
{
	//method to add n antural numbers
	public static int sumNumber(int number)
	{
		return (number*(number+1))/2;
	}
	
	//method to adding them recursively
	public static int recursion(int number)
	{
		if(number<=0)
		{
			return 0;
		}
		return recursion(number-1)+number;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("The sum of n natural number by sumNumber is "+sumNumber(number));
		System.out.println("The sum of n natural number by recursion is "+recursion(number));
	}
}