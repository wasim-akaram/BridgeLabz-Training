package com.iostream.csv;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObject 
{


    static class Student 
    {
        int id;
        String name;
        int age;

        Student(int id, String name, int age) 
        {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() 
        {
            return id + " " + name + " " + age;
        }
    }

      public static void main(String[] args) throws IOException 
      {

        String filePath = "D:/Rico/students.csv";
        List<Student> students = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

      
        br.readLine();

        while ((line = br.readLine()) != null) 
        {
            String[] data = line.split(",");

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            int age = Integer.parseInt(data[2]);

            students.add(new Student(id, name, age));
        }

        br.close();

        
        for (Student s : students) 
        {
            System.out.println(s);
        }
    }
}
