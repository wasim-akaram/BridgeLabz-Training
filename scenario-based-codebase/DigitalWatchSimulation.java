/* Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements 




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class DigitalWatchSimulation
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Press Enter to stop");
        
		Thread printer = new Thread(() -> {
            
					while (!Thread.currentThread().isInterrupted()) 
					{
						for(int hour=1; hour <=12; hour++)
						{
							for(int minutes =0; minutes<=59; minutes ++)
							{
								for (int second=0; second<=59; second++)
								{
									System.out.println(hour +":"+ minutes + ":" + second);
									
									try
									{
										Thread.sleep(1000); // 1 second
										
									} 
									catch (InterruptedException e)
									{
										Thread.currentThread().interrupt();
									}
									
										
						
								}
								
							}
						}
					}
			
			
			printer.start();
									
			new BufferedReader(new InputStreamReader(System.in)).readLine();
												
			// Interrupt the printing thread
			printer.interrupt();
	});
}
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitalWatchSimulation 
{

    public static void main(String[] args) throws Exception 
	{

        Thread printer = new Thread(() ->
		{
            try 
			{
                while (!Thread.currentThread().isInterrupted()) 
				{
					for(int hour =1; hour <=12; hour++)
					{
						for(int minutes=0; minutes<=59; minutes++)
						{
							for(int seconds =0; seconds<=59; seconds++)
							{
								System.out.println(hour +":"+ minutes + ":" + seconds);
								Thread.sleep(1000);
							}
						}
					}
                    
                }
            } 
			
			catch (InterruptedException e) 
			{
                // Restore interrupt status
                Thread.currentThread().interrupt();
            }
            System.out.println("Watch closed");
        });

        printer.start();

        // taking input if someone wants to stop
        System.out.println("Watch started \nPress ENTER to stop...");
        new BufferedReader(new InputStreamReader(System.in)).readLine();

        // Interrupt the printing thread
        printer.interrupt();
    }
}