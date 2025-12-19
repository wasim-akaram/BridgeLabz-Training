//program to find Leap year using && and || operators
 
import java.util.Scanner;
public class LeapYearUsingOperators
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner sc=new Scanner(System.in);
		
		// getting year from the user and checking it
        System.out.println("Enter year :");
        int year = sc.nextInt();
		
		//checking if we can determine its leap year or not
		if(year >=1582)
			{
		
				//printing if year is leap or not 
				if(((year%4==0)&&(year%100!=0))||(year%400==0))
					{
						System.out.println("The year " + year + " is a leap year");
					} 
				else 
					{
						System.out.println("The year " + year + " is not a leap year");
					}
			}
		else
			{
				System.out.println("year is less than 1582");
			}
		
	}
}