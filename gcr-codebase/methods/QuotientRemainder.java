//program to take 2 numbers and print their quotient and reminder


import java.util.*;
public class QuotientRemainder
{

    // Method To find quotient remainder
	
    public String findQuotientRemainder(int number1, int number2)
	{
		int quotient=number1 / number2;
		int remainder=number1 % number2;
		String output= " quotient is "+quotient+" and remainder is "+remainder;
		return output;
	}
	public static void main (String [] args)
	{
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number
        System.out.print("Enter the number1 and number2 ");
        int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		//create object  of class QuotientRemainder and call the method
		QuotientRemainder objRemainder =  new QuotientRemainder();
		
		String result = objRemainder.findQuotientRemainder(number1,number2);
		
		//display result
			System.out.println( result);
	}
}
		