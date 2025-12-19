// program FizzBuzz, take a number as user input and if it is a positive integer loop 
//from 0 to the number and save the number, but for multiples of 3 save "Fizz" 
//instead of the number, for multiples of 5 save "Buzz", and for multiples of 
//both save "FizzBuzz"



import java.util.*;
public class FizzBuzz 
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		String array[]= new String[number];
		int index=0;
		
		//checkin if it is positive
		if(number > 0 )
		{	
			//using for loop and storing
			for(int i=1; i<= number; i++)
			{
				//checking if the number is multiple of 3 or 5
				if(number % 3 ==0)
				{
					array[index]="Fizz";
					index ++;
				}
				else if(number % 5 ==0)
				{
					array[index]="Buzz";
					index ++;
				}
				else if((number % 5 ==0) && (number % 3 ==0))
				{
					array[index]="FizzBuzz";
					index ++;
				}
				else
				{
					array[index]=" "+i;
					index ++;
				}
			}	
			//printing the result
			for(int j=0; j<array.length; j++)
			{
				System.out.println("Position " + (j+1) + " = " + array[j]);
			}
			
		}
	}
}