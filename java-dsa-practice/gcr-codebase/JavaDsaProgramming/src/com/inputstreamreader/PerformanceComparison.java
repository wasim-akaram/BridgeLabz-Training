package com.inputstreamreader;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class PerformanceComparison 
{

    private static final int ITERATIONS = 1_000_000;
    private static final String SAMPLE_TEXT = "hello ";
    private static final String FILE_PATH = "D:/Faltu/largefile.txt"; // change path

    public static void main(String[] args) throws Exception 
    {

       
        // StringBuilder vs StringBuffer
      
        testStringBuilder();
        testStringBuffer();

       
        // FileReader vs InputStreamReader
      
        testFileReader();
        testInputStreamReader();
    }

    // ---------- StringBuilder ----------
    private static void testStringBuilder() 
    {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) 
        {
            sb.append(SAMPLE_TEXT);
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");
    }

    // ---------- StringBuffer ----------
    private static void testStringBuffer() 
    {
        long start = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) 
        {
            sb.append(SAMPLE_TEXT);
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }

    // ---------- FileReader ----------
    private static void testFileReader() throws IOException 
    {
        long start = System.currentTimeMillis();
        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                wordCount += line.split("\\s+").length;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("FileReader Words: " + wordCount);
        System.out.println("FileReader Time: " + (end - start) + " ms");
    }

    // ---------- InputStreamReader ----------
    private static void testInputStreamReader() throws IOException 
    {
        long start = System.currentTimeMillis();
        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILE_PATH),
                        StandardCharsets.UTF_8))) 
        {

            String line;
            while ((line = br.readLine()) != null) 
            {
                wordCount += line.split("\\s+").length;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("InputStreamReader Words: " + wordCount);
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }
}
