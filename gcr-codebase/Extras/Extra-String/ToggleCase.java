//Java program to toggle the case of each character in a given string. Convert
//uppercase letters to lowercase and vice versa.

import java.util.Scanner;
public class ToggleCase 
{

	public static void main(String[] args) 
	{
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(alternateStringCase(str));
    }
	

    // return string with toggled case
	
    public static String alternateStringCase(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++)
		{
            char c = str.charAt(i);

            if ('A' <= c && c <= 'Z') 
			{
                result += (char)(c + ' ');
            } else if ('a' <= c && c <= 'z') 
			{
                result += (char)(c - ' ');
            } 
			else 
			{
                result += c;
            }
        }

        return result;
    }

    
}