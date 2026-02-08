package com.iostream.csv;
import java.io.*;

public class CountCSVRows 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/employees.csv"));
        br.readLine(); 
        int count = 0;

        while (br.readLine() != null) 
        {
            count++;
        }
        br.close();
        System.out.println("Total records: " + count);
    }
}
