//program to store the digits of the number in an array and find the largest 
//and second largest element of the array.

import java.util.*;
public class LargestNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long number = sc.nextLong();
		
		long copy = number;
		int digit=0;
		
		
		//storing digits in array
		while(copy>0)
		{
			copy/=10;
			digit++;
		}
		long [] numberArray = new long[digit];
		
		for(int i=0; i<digit; i++)
		{
			numberArray[i]= number % 10;
			number/=10;
		}
		//variable to store largest and second largest
		long max = 0;
		long secondMax =0;
		for(int j =0; j<digit ; j++)
		{
			if(numberArray[j]>max)
			{
				secondMax = max;
				max = numberArray[j];
			}
			else if(numberArray[j]>secondMax && numberArray[j]!=max)
			{
				secondMax = numberArray[j];
			}
		}
		//print the largest and second largest digit
		System.out.println("The Largest digit is :"+max);
		System.out.println("The second Largest digit is :"+secondMax);
		
	}
}