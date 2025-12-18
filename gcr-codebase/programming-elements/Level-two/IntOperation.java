//An IntOperation program by taking a, b, and c as input values and print the 
//integer operations a + b *c, a * b + c, c + a / b, and a % b + c. 
import java.util.Scanner;
public class IntOperation
{
	public static void main(String[]args)
	{   
		//creating the variables and taking input of integers in variables a, b, and c as said in problem statement
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//calculating operation
		int result1 =a + b *c;
		int result2 = a * b + c;
		int result3 = c + a / b;
		int result4 = a % b + c;
		
		//printing the IntOperation clarifying the operation performed
		System.out.println("The results of Int Operations are  as follows: "+
		"\n operation a + b * c = " + result1 + 
		"\n operation a * b + c = " + result2 +	
		"\n operation c + a / b = " + result3 +
		"\n operation a % b + c = " + result4);
		
	}
}