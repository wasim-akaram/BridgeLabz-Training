package com.iostream.csv;
import java.io.*;

public class UpdateSalary 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/Rico/employees_updated.csv"));

        String line = br.readLine();
        bw.write(line);
        bw.newLine();

        while ((line = br.readLine()) != null) 
        {
            String[] d = line.split(",");
            if (d[2].equalsIgnoreCase("IT")) 
            {
                double salary = Double.parseDouble(d[3]) * 1.10;
                d[3] = String.valueOf((int) salary);
            }
            bw.write(String.join(",", d));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
