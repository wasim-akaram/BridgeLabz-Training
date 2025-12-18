//program to find the sum of numbers until the user enters 0

import java.until.*;
public class ContinuousSum
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(system.in);
		
		//asking for input
		System.out.println("Enter the numbers to be added");
		
		
		//creating variable for initializing loop an sum
		int current=1 , sum=0;
		
		//taking input in while loop and adding
		while (current !=0)
		{
		int number= input. nextInt();
		current=number;
		sum= sum + current;
		}
	}
}
		