package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SensorBadWords 
{

	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	
    	List<String> listOfBadWords = new ArrayList<>();
    	listOfBadWords.add("damn");
    	listOfBadWords.add("stupid");
    	listOfBadWords.add("dumb");
    	
    	//passing the list in regex 
    	String regex = String.join("|", listOfBadWords);
    	
    	System.out.println("Enter the text");
    	
        String text = sc.nextLine();

    
        
        String result = text.replaceAll(regex, "*****");
        
        System.out.println(result);


        
    }

}
