//program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter



import java.util.Scanner;
public class VowelsAndConsonantsDisplay
{

	public static void main(String[] args) 
	{
        
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        String[][] result = getStatus(text);

        System.out.printf("Character", "Status");
        
        for (String[] charAndStatus : result) 
		{
            System.out.printf(charAndStatus[0],charAndStatus[1]);
        }

    }
	
	
	
    // checking if a character is vowel or consonant
    public static String isVowelOrConsonant(char c)
	{
        if ('A' <= c && c <= 'Z') 
		{
            c = (char)(c + ' ');
        }

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
        if ('a' <= c && c <= 'z') {
            for (char vowel: vowels) 
			{
                if (vowel == c) 
				{
                    return "Vowel";
                }
            }
            return "Consonant";
        } 
		else 
			{
				return "Not a Letter";
			}
    }

    public static int countCharacter(String text) 
	{
        int count = 0;

        for (int i = 0; i < text.length(); i++) 
		{
            char c = text.charAt(i);
            if ('A' < c && c < 'Z' || 'a' < c && c < 'z' ) 
			{
                count++;
            }
        }

        return count;
    }

    // to get the count of vowels and consonants
    public static String[][] getStatus(String text) 
	{
        int characterCount = countCharacter(text);
        String[][] array = new String[characterCount][2];

        int index = 0;
        for (int i=0; i < text.length(); i++) 
		{
            char c = text.charAt(i);
            String result = VowelsAndConsonantsDisplay.isVowelOrConsonant(c);
            if (result == "Vowel" || result == "Consonant") 
			{
                array[index][0] = Character.toString(c);
                array[index][1] = result;
                index++;
            }
        }

        return array;
    }

    
}