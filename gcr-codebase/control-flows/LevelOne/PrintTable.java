//a program to find the multiplication table of a number entered by the user from 6 to 9.


import java.util.*;
public class PrintTable
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		//asking for input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		//writing the table
		for(int table=6; table <=9; table++)
		{
			System.out.println(number * table);
		}
	}
}