package com.functionalInterface.temperarureAlertSystem;
import java.util.function.Function;

public class StringLengthChecker 
{

    public static void main(String[] args) 
    {

        Function<String, Integer> lengthFunction = str -> str.length();

        String message = "Insurance policy approved";

        int length = lengthFunction.apply(message);

        if (length > 20) {
            System.out.println("Message exceeds character limit");
        }
        else 
        {
            System.out.println("Message within limit");
        }
    }
}
