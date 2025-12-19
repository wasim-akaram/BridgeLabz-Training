//a program to find the multiplication table of a number entered by the user from 6 to 9.


import java.util.*;
public class TableArray
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		int multiplicationresult[]= new int[4];
		int current=6;
		int position =0;
		
		//storing array result
		while(current<10)
		{
				multiplicationresult[position]=number * current;
				position++;
				current++;
		}
		
		//writing the table
		for(int j=0; j <4; j++)
		{	
			int pos=j+6;
			System.out.println( number  + " * " + pos + " = " + multiplicationresult[j]);
		}
	}
}