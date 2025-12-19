//program to check if a number taken from the user is a Harshad Number.
//A Harshad number is an integer which is divisible by the sum of its digits.


import java.util.Scanner;
public class HarshadNumber
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int copy = number;
		int sum=0;
		
		//finding sum of digits
		while(copy > 0)
		{
			sum= sum + (copy % 10);
			copy= copy / 10;
		}
		
		//checking if number is Harshad number
		if(number % sum == 0)
		{
			System.out.println("It is Harshad number");
		}
		else
		{
			System.out.println("It is not a Harshad number");
		}
	}
}