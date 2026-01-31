package com.javaStreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ErrorReader {

    public static void main(String[] args) 
    {

        String filePath = "D:\\Rico\\large_test_log_50mb.txt";

        try (
            BufferedReader br = new BufferedReader(
                    new FileReader(filePath, StandardCharsets.UTF_8))
        )
        {
            String line = br.readLine();

            while (line != null) 
            {
                
                if (line.toLowerCase().contains("error")) 
                {
                    System.out.println(line);
                }
            }

        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
