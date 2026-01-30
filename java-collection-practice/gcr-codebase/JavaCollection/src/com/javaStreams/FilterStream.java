package com.javaStreams;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FilterStream 
{

    public static void main(String[] args) 
    {

        File sourceFile = new File("D:\\Rico\\Read.txt");
        File destinationFile = new File("D:\\Rico\\Write.txt");

    
        try (
            FileReader fr = new FileReader(sourceFile, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(destinationFile, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(fw)
        ) 
        {
            String line;

        
            while ((line = br.readLine()) != null) 
            {
            
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("File copied and converted to lowercase successfully.");

        } 
        catch (IOException e) 
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
