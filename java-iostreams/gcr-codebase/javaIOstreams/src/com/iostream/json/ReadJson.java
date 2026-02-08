package com.iostream.json;
import java.io.*;

public class ReadJson {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("D:/Rico/user.json"));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.contains(":")) {
                String[] parts = line.replace("\"", "")
                                     .replace(",", "")
                                     .split(":");
                System.out.println(parts[0].trim() + " = " + parts[1].trim());
            }
        }
        br.close();
    }
}
