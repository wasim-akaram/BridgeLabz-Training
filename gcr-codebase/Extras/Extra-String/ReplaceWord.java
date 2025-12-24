// method in Java that replaces a given word with another word in a sentence:



iimport java.util.Scanner;
public class ReplaceWord 
{

	
    public static void main(String[] args) 
	{
        
        Scanner sc = new Scanner(System.in);
        ReplaceWord object = new ReplaceWord();

        String str = sc.nextLine();
        String presentWord = sc.next(), replaceWithWord = sc.next();
        System.out.println(object.replaceWordFromString(str,presentWord,replaceWithWord));
    }



    //  method to replace a word with another in a string
    public String replaceWordFromString(String str, String presentWord, String replaceWithWord) 
	{
        String result = "";
        int i = 0;
        while ( i <= str.length() - presentWord.length()) 
			{
				boolean found = true;
				int j = 0;
				while (j < presentWord.length()) 
					{
						if (str.charAt(i+j) != presentWord.charAt(j)) 
							{
								found = false;
								break;
							}
						j++;
					}

				if (found) 
					{
						result += replaceWithWord;
						i += j;
						continue;
					} 
				else
					{
						result += str.charAt(i);
						i++;
					}
			}

        while (i < str.length())
		{
            result += str.charAt(i);
            i++;
        }
        
        return result;
    }

}