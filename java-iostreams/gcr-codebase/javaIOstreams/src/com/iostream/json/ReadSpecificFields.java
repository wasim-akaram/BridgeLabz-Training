package com.iostream.json;
import java.io.*;

public class ReadSpecificFields 
{
    public static void main(String[] args) throws Exception 
    {

        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/user.json"));
        String line;
        String name = "", email = "";

        while ((line = br.readLine()) != null) 
        {
            line = line.trim();

            if (line.startsWith("\"name\"")) {
                name = line.split(":")[1].replace("\"", "").replace(",", "").trim();
            }
            if (line.startsWith("\"email\"")) {
                email = line.split(":")[1].replace("\"", "").replace(",", "").trim();
            }
        }
        br.close();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
