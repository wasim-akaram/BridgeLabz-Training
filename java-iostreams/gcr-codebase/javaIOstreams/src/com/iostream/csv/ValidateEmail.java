package com.iostream.csv;
import java.io.*;

import java.util.regex.*;

public class ValidateEmail 
{
    public static void main(String[] args) throws IOException 
    {
        Pattern emailP = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Pattern phoneP = Pattern.compile("\\d{10}");

        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/users.csv"));
        String line = br.readLine();

        while ((line = br.readLine()) != null) 
        {
            String[] d = line.split(",");
            if (!emailP.matcher(d[2]).matches() || !phoneP.matcher(d[3]).matches()) 
            {
                System.out.println("Invalid Row: " + line);
            }
        }
    }
}
