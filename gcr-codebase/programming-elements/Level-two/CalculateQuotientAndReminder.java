//A program to calculate quotient and reminder
import java.util.Scanner;
public class CalculateQuotientAndReminder
{
	public static void main(String[]args)
	{
	    // Taking input from user after creating Scanner object
		Scanner s=new Scanner(System.in);
		int number1 = s.nextInt();
		int number2 = s.nextInt();
        
		
		//Calculation of quotient and reminder
		double quotient= number1/number2;
		double reminder= number1%number2;
		

		//printing the quotient and reminder
		System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+number1+" and "+number2);
		s.close();
	}
}