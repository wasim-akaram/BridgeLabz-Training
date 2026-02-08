package com.iostream.csv;
import java.io.*;

public class FilterStudents 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/students.csv"));
        String line = br.readLine(); 

        while ((line = br.readLine()) != null) 
        {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);
            if (marks > 80) 
            {
                System.out.println(line);
            }
        }
        br.close();
    }
}
