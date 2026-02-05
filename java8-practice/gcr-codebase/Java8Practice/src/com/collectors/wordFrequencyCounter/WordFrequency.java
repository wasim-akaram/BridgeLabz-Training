package com.collectors.wordFrequencyCounter;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency 
{
    public static void main(String[] args) 
    {

        String text = "java is going good but wehave to practice java more";

        Map<String, Integer> wordCount =Arrays.stream(text.split("\\s+")).collect(Collectors.toMap(
                                word -> word,
                                word -> 1,
                                Integer::sum   
                        ));

        System.out.println(wordCount);
    }
}
