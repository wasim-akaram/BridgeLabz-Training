package com.regex;

import java.util.Scanner;

public class ValidateIP
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

       System.out.println("Enter the IP Address");
       String address = sc.next();
       String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.)){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

;

       
            if (address.matches(regex)) 
            {
                System.out.println(" Valid IP Address");
            } 
            else 
            {
                System.out.println("Invalid IP Address");
            }
        }

}
