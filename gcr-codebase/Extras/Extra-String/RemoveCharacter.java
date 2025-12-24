//Java program to remove all occurrences of a specific character from a string.


import java.util.Scanner;
public class RemoveCharacter 
{
    
    public String removeChracterFromString(String str, char charToRemove) 
	{
        String result = "";
        for (int i = 0; i < str.length(); i++)
		{
            char currentChar = str.charAt(i);
            if (currentChar == charToRemove) 
			{
                continue;
            }
            result += currentChar;
        }

        return result;
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        RemoveCharacter obj = new RemoveCharacter();

        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(obj.removeChracterFromString(str,c));
    }
}