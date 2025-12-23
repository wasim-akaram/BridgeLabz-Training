//program to trim the leading and trailing spaces from a string using the charAt() method


import java.util.Scanner;
public class StringTrimmer 
{
   
	 public static void main(String[] args) 
	{
       
        Scanner input = new Scanner(System.in);
        StringTrimmer object = new StringTrimmer();

        String text = input.nextLine();

        int[] trimIndexes = object.getIndexesToTrim(text);

        String customTrimmed = object.getSubString(text, trimIndexes[0],trimIndexes[1]+1);
        String trimmed = text.trim();

        if (object.compareStrings(customTrimmed,trimmed)) 
		{
            System.out.println("Both are same");
        } 
		else
		{
            System.out.println("They are different");
        }

    }



   
	//finding the starting and ending index
    public int[] getIndexesToTrim(String str){
        int startIndex = 0;
        int endIndex = str.length() - 1;

        while (startIndex <= endIndex) 
		{
            if (str.charAt(startIndex) != ' ') 
			{
                break;
            }
            startIndex++;
        }

        while (startIndex <= endIndex)
			{
				if (str.charAt(endIndex) != ' ') 
					{
						break;
					}
				endIndex--;
			}

        return new int[]{startIndex,endIndex};
    }

    // get substring using charAt method
    public String getSubString(String str, int startIndex, int endIndex) 
	{
        char[] array = new char[endIndex - startIndex];

        for (int index = startIndex; index < endIndex; index++) 
		{
            array[index - startIndex] = str.charAt(index);
        }

        return new String(array).intern();
    }

    // compares two strings by checking each and every character
    public boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

   
}