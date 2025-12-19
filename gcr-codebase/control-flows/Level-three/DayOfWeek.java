//program DayOfWeek that takes a date as input and prints the 
//day of the week that the date falls on

public class DayOfWeek
{
    public static void main(String args[])
	{
		//taking inputs
        int m = Integer.parseInt(args[0]); 
        int d = Integer.parseInt(args[1]); 
        int y = Integer.parseInt(args[2]);
		
		//calculating days using given formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
		
		
		//displaying the output
        if(d0==0)
		{
			System.out.println("Sunday");
		}
		else if(d0==1)
		{
			System.out.println("Monday");
		}
		else if(d0==2)
		{
			System.out.println("Tuesday");
		}
		else if(d0==3)
		{
			System.out.println("Wednesday");
		}else if(d0==4)
		{
			System.out.println("Thursday");
		}
		else if(d0==5)
		{
			System.out.println("Friday");
		}
		else
		{
			System.out.println("Saturday");
		}
    }
}