package com.algorithmanalysis;


import java.io.*;
public class LargeFileReadingEfficiency 
{
	

	

	    private static final String FILE_PATH = "D:\\Faltu\\Read.txt";

	    // -------- FileReader --------
	    public static void readUsingFileReader() throws IOException {
	        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) 
	        {
	            while (br.readLine() != null) 
	            {
	            	//read line wise
	            }
	        }
	    }

	    // -------- InputStreamReader --------
	    public static void readUsingInputStreamReader() throws IOException 
	    {
	        try (BufferedReader br = new BufferedReader(
	                new InputStreamReader(new FileInputStream(FILE_PATH), "UTF-8"))) 
	        {
	            while (br.readLine() != null) {
	                // reading line by line
	            }
	        }
	    }

	    // -------- Main Method --------
	    public static void main(String[] args) throws IOException
	    {

	        long start = System.nanoTime();
	        readUsingFileReader();
	        long fileReaderTime = System.nanoTime() - start;

	        start = System.nanoTime();
	        readUsingInputStreamReader();
	        long inputStreamReaderTime = System.nanoTime() - start;

	        System.out.println("FileReader Time (ms): " +
	                fileReaderTime / 1000000.0);

	        System.out.println("InputStreamReader Time (ms): " +
	                inputStreamReaderTime / 1000000.0);
	    }
	}



