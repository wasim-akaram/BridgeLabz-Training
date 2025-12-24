//program to find the frequency of characters in a string using unique characters and display the result


import java.util.Scanner;
public class FrequencyOfCharacter2
{ 
	 public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String [][]frequency = getFrequencyOfCharacter(text);
        for (int i = 0; i < frequency.length; i++)
		{
            System.out.println(frequency[i][0] + " " + frequency[i][1]);
        }
    }

    // to get frequency 
	
    public static String[][] getFrequencyOfCharacter(String text) 
	{
        int[] frequency = new int[256];
        int chars = 0;

        for (int i = 0; i < text.length(); i++) 
		{
            char c = text.charAt(i);
            if (frequency[c] == 0) 
			{
                chars++;
            }
            frequency[c]++;
        }
		
		
		
		//index variable to iterate
        int index = 0;
		
		
        String [][]fixedFrequency = new String[chars][2];
        for (int i = 0; i < 256; i++) 
		{
            if (frequency[i] != 0) 
			{
                fixedFrequency[index][0] = (char)i + "";
                fixedFrequency[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }
        return fixedFrequency;
    }
   
}