//A DoubleOperation program by taking a, b, and c as input values and print the 
//integer operations a + b *c, a * b + c, c + a / b, and a % b + c. 

import java.util.Scanner;
public class DoubleOperation
{
	public static void main(String[]args)
	{   
		//creating variables of type double and taking user inputs in variables named a, b and c as stated in the problem
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		
		//calculating operation as stated
		double result1 =a + b *c;
		double result2 = a * b + c;
		double result3 = c + a / b;
		double result4 = a % b + c; 
		
		//printing the IntOperation clarifying the operation performed
		System.out.println("The results of double Operations are  as follows: "+
		"\n operation a + b * c = " + result1 + 
		"\n operation a * b + c = " + result2 +	
		"\n operation c + a / b = " + result3 +
		"\n operation a % b + c = " + result4);
		
	}
}