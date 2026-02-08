package com.iostream.csv;
import java.io.*;

public class WriteEmployeeCSV 
{
    public static void main(String[] args) throws IOException 
    {
        String path = "D:/Rico/employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) 
        {
            bw.write("ID,Name,Department,Salary");
            bw.newLine();
            bw.write("1,Wasim,IT,50000");
            bw.newLine();
            bw.write("2,Vipin,HR,45000");
            bw.newLine();
            bw.write("3,Vishal,Finance,60000");
            bw.newLine();
            bw.write("4,Rico,IT,70000");
            bw.newLine();
            bw.write("5,Karan,Sales,40000");
        }
        System.out.println("CSV written successfully");
    }
}
