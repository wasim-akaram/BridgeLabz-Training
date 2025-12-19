//program to count the number of digits in an integer.


import java.util.Scanner;
public class DigitCounter
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int count =0;
		
		//counting the digits
		while(number > 0)
		{
			count++;
			number = number/10;
		}
		System.out.println("The number of digits is " + count );
	}
}