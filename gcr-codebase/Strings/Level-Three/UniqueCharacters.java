//Find unique characters in a string using the charAt() method and display the result


import java.util.Scanner;
public class UniqueCharacters
{
	//methof to find length of string
	public static int findLengthOfString ( String str)
	{
		int length =0;
		for (char c : str.toCharArray()) 
        {
            length++;
        }
		return length;
	}
	
	public static char[] getUniqueCharacters(String str, int length)
	{
        
        char[] temp = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) 
		{
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < i; j++) 
			{
                if (str.charAt(j) == currentChar) 
				{
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) 
			{
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        char[] uniqueChars = new char[uniqueCount];
        for (int k = 0; k < uniqueCount; k++) 
		{
            uniqueChars[k] = temp[k];
        }
        
        return uniqueChars;
    }
	
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = sc.next();
		
		//calling method to find length of the string
		int lengthOfString = findLengthOfString(str);
		
		//calling method to get unique characters
	
		char [] result = getUniqueCharacters(str, lengthOfString);
		
		System.out.print("All the unique characters in the string are: ");
        for (char c : result) 
		{
            System.out.print(c + " ");
        }
	}
}