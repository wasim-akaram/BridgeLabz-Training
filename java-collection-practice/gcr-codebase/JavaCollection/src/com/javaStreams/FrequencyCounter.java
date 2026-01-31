package com.javaStreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyCounter {

    public static void main(String[] args) 
    {

        String filePath = "D:\\Rico\\large_test_log_50mb.txt"; 

        Map<String, Integer> wordCountMap = new HashMap<>();

         
        try (BufferedReader buffereader = new BufferedReader(new FileReader(filePath))) 
        {

            String line;

            while ((line = buffereader.readLine()) != null) 
            {

        
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

        
                String[] words = line.split("\\s+");

                for (String word : words) 
                {
                    if (!word.isEmpty()) 
                    {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());

        wordList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        
        System.out.println("Top 5 most frequent words:");
        int limit = Math.min(5, wordList.size());

        for (int i = 0; i < limit; i++) 
        {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
