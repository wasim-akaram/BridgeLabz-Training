package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CheckedException
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("D:\\Rico\\willnotget.txt"));
			
			String line;
			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
			
		}
		catch(IOException exp)
		{
			System.out.println("Exception Occured");
			System.out.println("\nFile not found");
			System.out.println("\n"+exp.getMessage());
		}
		
	}

}
