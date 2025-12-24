//Java program to count how many times a given substring occurs in a string.


import java.util.Scanner;
public class CountOfSubtring 
{
	
    public static void main(String[] args) 
	{
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String mainString = sc.nextLine();
		
	
        
        System.out.print("Enter the substring you want to count for: ");
        String subString = sc.nextLine();
        
        int count=0, index = 0;
        
		
        while ((index = mainString.indexOf(subString, index)) != -1) 
		{
            count++;
            index += subString.length();
        }
        
        System.out.println("The substring \"" + subString + "\" occurs " + count + " time(s) in the main string.");
        
        sc.close();
    }
}