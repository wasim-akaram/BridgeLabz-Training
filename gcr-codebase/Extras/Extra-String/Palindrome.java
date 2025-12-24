//Write a Java program to check if a given string is a palindrome (a string that reads the
//same forward and backward).



import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (isItPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
        
        sc.close();
    }
    
    public static boolean isItPalindrome(String str) 
	{
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) 
		{
            if (str.charAt(left) != str.charAt(right)) 
			{
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}