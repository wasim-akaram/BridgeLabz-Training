//a program to find all the multiples of a number taken as user input below 100.

import java.util.*;
public class MultiplesOfNumberUsingWhile
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		//checking if its positive
		if (number>0 && number<100)
		{
			int counter= 100;
			while(counter >0)
			{
				//checking if it is the multiples
				if(counter%number == 0)
				{
					System.out.println(counter);
				}
				counter --;
			}
		}
	}
}