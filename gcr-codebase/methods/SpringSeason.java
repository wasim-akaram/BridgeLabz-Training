//SpringSeason that takes two int values month and day from the command line and prints 
//“Its a Spring Season” otherwise prints “Not a Spring Season”.

import java.util.*;
public class SpringSeason
{
	//method to print if its Spring or not
	public String checkSason(int month, int date)
	{
		String season;
		if (
			((month == 3 && date >= 20) ||
			((month == 4&& date >= 1) &&  date < 31) || 
			(month == 5 && (date >=1 &&  date <= 31)) || 
			(month == 6 && date <= 20)))
			{
            season="It's a Spring Season.";
			} 
		else 
			{
				season="Not a Spring Season.";
			}
		return season;
	}
	 
	public static void main (String args[])
	{
		
        //taking month  and dateinput from user
		 int month = Integer.parseInt(args[0]);
		 int date = Integer.parseInt(args[1]);
		 
		//creating object of SpringSeason
		SpringSeason sp= new SpringSeason();
		
		//calling method 
		String result = sp.checkSason(month, date);
		
		//display result
		System.out.println(result);
	}
}
        