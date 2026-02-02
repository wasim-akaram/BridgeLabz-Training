package com.regex;

import java.util.Scanner;
public class ValidLIncensePlateNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

       System.out.println("Enter the license palte number");
       String license = sc.next();
       String regex = "^[A-Z]{2}\\d{4}$";
;

       
            if (license.matches(regex)) 
            {
                System.out.println(" Valid license plate number");
            } 
            else 
            {
                System.out.println("Invalid license plate number");
            }
        }
    }


