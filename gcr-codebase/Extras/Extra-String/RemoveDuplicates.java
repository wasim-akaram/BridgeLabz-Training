//Java program to remove all duplicate characters from a given string and return
//the modified string.


import java.util.Scanner;
public class RemoveDuplicates 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String output = removeDuplicateCharacter(input);
        System.out.println("String after removing duplicates: " + output);
        sc.close();
    }

    public static String removeDuplicateCharacter(String str) 
	{
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) 
		{
            char ch = str.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) 
			{
                sb.append(ch);
            }
        }
		
        return sb.toString();
    }
}




