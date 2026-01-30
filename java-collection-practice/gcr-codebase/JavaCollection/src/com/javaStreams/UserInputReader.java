package com.javaStreams;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputReader 
{
    public static void main(String[] args) 
    {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        try {
        	
            // Ask the user to provide the input
            System.out.print("Enter your name: ");
            String name = bufferedReader.readLine();

            System.out.print("Enter your age: ");
            String age = bufferedReader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = bufferedReader.readLine();

            // Write the given input to a file
            try (FileWriter fw = new FileWriter("D:\\Rico\\UserInput.txt")) {
                fw.write("Name: " + name + "\n");
                fw.write("Age: " + age + "\n");
                fw.write("Favorite Programming Language: " + language + "\n");
            }

            System.out.println("User information saved successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
