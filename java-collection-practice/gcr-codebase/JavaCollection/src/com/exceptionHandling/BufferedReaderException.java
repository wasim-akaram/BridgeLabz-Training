
package com.exceptionHandling;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderException 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			BufferedReader read = new BufferedReader(new FileReader("D:\\Rico\\Read.txt"));
			
			String line;
			
				System.out.println(read.readLine());
			
		}
		catch(IOException e )
		{
			System.out.println("File not found: " + e.getMessage());
		}
	}

}
