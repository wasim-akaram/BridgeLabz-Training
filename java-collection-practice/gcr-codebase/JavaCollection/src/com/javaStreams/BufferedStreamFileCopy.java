package com.javaStreams;
import java.io.*;

public class BufferedStreamFileCopy 
{

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) 
    {

        File source = new File("D:\\Rico\\Read.txt");

        File unbufferedDest = new File("D:\\Rico\\Write.txt");
        File bufferedDest = new File("D:\\Rico\\Write.txt");

       
        long unbufferedTime = copyUsingUnbufferedStream(source, unbufferedDest);

     
        long bufferedTime = copyUsingBufferedStream(source, bufferedDest);

       
        System.out.println("Unbuffered Stream Time : " + unbufferedTime + " ms");
        System.out.println("Buffered Stream Time   : " + bufferedTime + " ms");
    }

  
    private static long copyUsingUnbufferedStream(File source, File dest) 
    {

        long startTime = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest)
        ) 
        {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) 
            {
                fos.write(buffer, 0, bytesRead);
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Unbuffered error: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; 
    }

  
    private static long copyUsingBufferedStream(File source, File dest) 
    {

        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(dest))
        ) 
        {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1)
            {
                bos.write(buffer, 0, bytesRead);
            }

        }
        catch (IOException e) 
        {
            System.out.println("Buffered error: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000;

    }
}
