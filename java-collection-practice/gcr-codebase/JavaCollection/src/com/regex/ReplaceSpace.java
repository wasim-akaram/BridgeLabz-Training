package com.regex;

import java.util.Scanner;

public class ReplaceSpace 
{
	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter a text to replace space");
    	
        String text = sc.nextLine();

    
        String regex = "\\s+";
        String result = text.replaceAll("\\s+", " ");
        
        System.out.println(result);


        
    }


}
