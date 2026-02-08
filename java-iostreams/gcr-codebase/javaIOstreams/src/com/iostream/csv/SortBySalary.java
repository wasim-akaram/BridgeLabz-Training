package com.iostream.csv;
import java.io.*;

import java.util.*;

public class SortBySalary 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/employees.csv"));
        List<String[]> list = new ArrayList<>();
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) 
        {
            list.add(line.split(","));
        }

        list.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

        list.stream().limit(5).forEach(e ->
                System.out.println(e[1] + " " + e[3]));
    }
}
