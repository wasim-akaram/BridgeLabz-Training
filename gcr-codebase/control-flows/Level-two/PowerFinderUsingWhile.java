// program to find the power of a number using while loop


import java.util.*;
public class PowerFinderUsingWhile
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
		while(power > 0)
		{
			result=number * result;
			power--;
		}
		//display output
		System.out.println("The result is " + result);
		
	}
}
		