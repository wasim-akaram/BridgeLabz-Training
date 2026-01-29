package com.javaStreams;
import java.io.*;

public class FileHandling

 {
    public static void main(String[] args) 
	{
    	 File sourceFile = new File("D:\\Rico\\Read.txt");
    	
    	

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream("D:\\Rico\\Read.txt");
             FileOutputStream fos = new FileOutputStream("D:\\Rico\\Write.txt")) 
			 {
            
            int byteData;
            while ((byteData = fis.read()) != -1) 
			{
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
}
