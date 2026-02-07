package com.iostream.csv;
import java.io.*;

public class ReadCSV {
    public static void main(String[] args) throws Exception {
    	

        BufferedReader br = new BufferedReader(new FileReader("D:\\Rico\\Students.csv"));
        String line;

        

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println( data[0] +
                               "	"+ data[1] +
                               "	" + data[2] +
                               "	" + data[3]);
        }
        br.close();
    }
}
