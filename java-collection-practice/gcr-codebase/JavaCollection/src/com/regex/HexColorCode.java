package com.regex;

import java.util.Scanner;

public class HexColorCode 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

       System.out.println("Enter the COLOR CODE");
       String code = sc.next();
       String regex = "^[#][0-9, A-F, a-f]{6}$";


       
            if (code.matches(regex)) 
            {
                System.out.println(" Valid color code");
            } 
            else 
            {
                System.out.println("Invalid color code");
            }
    }

}
