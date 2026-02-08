package com.iostream.csv;
import java.io.*;

public class SearchEmployee 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/employees.csv"));
        String nameToSearch = "Vipin";
        String line = br.readLine();

        while ((line = br.readLine()) != null) 
        {
            String[] d = line.split(",");
            if (d[1].equalsIgnoreCase(nameToSearch)) 
            {
                System.out.println("Department: " + d[2] + ", Salary: " + d[3]);
            }
        }
        br.close();
    }
}
