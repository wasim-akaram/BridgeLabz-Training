//Java program to find the most frequent character in a string.



import java.util.Scanner;
public class MostFrequentCharacter 
{
		
		 public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        System.out.println("Most frequent char is " + findMostFrequentCharacter(text));
    }


    // to find the most frequent chat in a string
    public static char findMostFrequentCharacter(String str) 
	{
        int []occurance = new int[256];
        char mostFrequentCharacter = ' ';

        for (int i = 0; i < str.length(); i++)
		{
            char c = str.charAt(i);
            occurance[c]++;
			
            if (occurance[c] > occurance[mostFrequentCharacter])
			{
                mostFrequentCharacter = c;
            }
        }

        return mostFrequentCharacter;
    }
   
}
