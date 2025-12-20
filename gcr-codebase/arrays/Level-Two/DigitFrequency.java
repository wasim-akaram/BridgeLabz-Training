//program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit

import java.util.Scanner;

public class DigitFrequency
 {
    public static void main(String[] args)
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine(); 
       
        int[] frequency = new int[10];

        //storing digits frequency
        
       for(int i = 0; i < number.length(); i++) 
       {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                frequency[digit]++;
            }
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) 
        {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
     
    }
}