package com.iostream.csv;
import java.io.*;

import java.util.*;

public class DetectDuplicates 
{
    public static void main(String[] args) throws IOException 
    {
        Set<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/largefile.csv"));
        br.readLine();
        String line;

        while ((line = br.readLine()) != null) 
        {
            String id = line.split(",")[0];
            if (!set.add(id)) {
                System.out.println("Duplicate: " + line);
            }
        }
    }
}
