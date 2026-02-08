package com.iostream.csv;
import java.io.*;

import java.util.*;

public class MergeCSV 
{
    public static void main(String[] args) throws IOException 
    {
        Map<String, String> map = new HashMap<>();
        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));

        br1.readLine();
        String line;
        while ((line = br1.readLine()) != null) 
        {
            String[] d = line.split(",");
            map.put(d[0], d[1] + "," + d[2]);
        }

        br2.readLine();
        while ((line = br2.readLine()) != null) 
        {
            String[] d = line.split(",");
            System.out.println(d[0] + "," + map.get(d[0]) + "," + d[1] + "," + d[2]);
        }
    }
}
