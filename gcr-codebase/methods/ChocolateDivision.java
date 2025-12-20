//program to divide N number of chocolates among M children. Print the number of 
//chocolates each child will get and also the remaining chocolates


import java.util.*;
public class ChocolateDivision
{

    // Method To find number of chocolate each student gets and remaining chocolates
	
    public String findNumberOfChocolate(int chocolate, int children)
	{
		int share=chocolate / children;
		int remainder=chocolate % children;
		String output= " Each child gets  "+ share+ " and remaining chocolate is "+remainder;
		return output;
	}
	
	
	public static void main (String [] args)
	{
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for chocolate and childres
        System.out.print("Enter the numberf chocolates and children ");
        int chocolate = sc.nextInt();
		int child= sc.nextInt();
		
		//create object  of class QuotientRemainder and call the method
		ChocolateDivision objRemainder =  new ChocolateDivision();
		
		String result = objRemainder.findNumberOfChocolate(chocolate, child);
		
		//display result
			System.out.println( result);
	}
}
