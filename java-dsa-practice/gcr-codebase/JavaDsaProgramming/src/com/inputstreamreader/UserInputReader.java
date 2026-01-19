package com.inputstreamreader;


import java.io.*;
public class UserInputReader 
{
	

	
	    public static void main(String[] args) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        FileWriter fw = new FileWriter("output.txt");

	        String input;
	        while (!(input = br.readLine()).equalsIgnoreCase("exit")) 
	        {
	            fw.write(input + "\n");
	        }

	        fw.close();
	        br.close();
	    }
}

	
	
	


