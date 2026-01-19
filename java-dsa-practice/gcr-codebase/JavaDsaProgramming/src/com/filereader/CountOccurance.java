package com.filereader;


import java.io.*;
public class CountOccurance 
{
	public static void main(String[] args) throws IOException 
	{
	        String target = "are";
	        int count = 0;

	        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Faltu\\Read.txt")))
	        {
	            String line;
	            while ((line = br.readLine()) != null) 
	            {
	                for (String word : line.split("\\s+")) 
	                {
	                    if (word.equalsIgnoreCase(target)) 
	                    {
	                        count++;
	                    }
	                }
	            }
	        }
	        System.out.println("Occurrences: " + count);
	    }
	}



