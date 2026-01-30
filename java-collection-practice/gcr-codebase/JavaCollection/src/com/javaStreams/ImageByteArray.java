package com.javaStreams;
import java.io.*;

public class ImageByteArray {

    public static void main(String[] args) {

        File originalImage = new File("D:\\Rico\\ReadImage.jpeg");
        File copiedImage = new File("D:\\Rico\\copied.jpg");

        try {
        	
           
            byte[] imageBytes = readImageAsByteArray(originalImage);

           
            writeByteArrayToImage(imageBytes, copiedImage);

           
            if (areFilesIdentical(originalImage, copiedImage)) 
            {
                System.out.println("Files are identical");
            }
            else
            {
                System.out.println("Files are NOT identical");
            }

        }
        catch (IOException e) 
        {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    
    private static byte[] readImageAsByteArray(File file) throws IOException 
    {

        try (
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) 
        {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) 
            {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

        private static void writeByteArrayToImage(byte[] data, File file) throws IOException 
        {

        try (
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            FileOutputStream fos = new FileOutputStream(file)
        )
        {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) 
            {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    
    private static boolean areFilesIdentical(File f1, File f2) 
    {
        return f1.length() == f2.length();
    }
}
