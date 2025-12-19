// program to find the power of a number using for loop


import java.util.*;
public class PowerFinderUsingFor
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number and the power");
		int number = input.nextInt();
		int power = input.nextInt();
		
		int result =1;
		
		//running for loop to find power
		for(int i =1; i<=power; i++)
		{
			result=number * result;
		}
		//display output
		System.out.println("The result is " + result);
		
	}
}
		