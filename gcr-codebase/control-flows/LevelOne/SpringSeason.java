//program SpringSeason that takes two int values month and day from the 
// command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.

public class SpringSeason 
{
    public static void main(String[] args) 
    {   
		//asking users tto give month as input
		System.out.print("Enter month in range(1-12): ");
       
        //taking month input from user
		 int month = Integer.parseInt(args[0]);
        
        //asking users to give date as input
		System.out.print("Enter date in range(1-31): ");

        //taking date input from user
		int date = Integer.parseInt(args[1]);
        

        //checking if the date falls in spring season and displaying result on output
        if (
			((month == 3 && date >= 20) ||
			((month == 4&& date >= 1) &&  date < 31) || 
			(month == 5 && (date >=1 &&  date <= 31)) || 
			(month == 6 && date <= 20)))
			{
            System.out.println("It's a Spring Season.");
			} 
		else 
		{
            System.out.println("Not a Spring Season.");
        }
    }
}