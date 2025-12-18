//program to check for the natural number and write the sum of n natural numbers

import java.util.Scanner;
public class NaturalNumber
{
    public static void main(String[] args) 
    {   
        //creating scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        //checking if the number is a natural number
        if (number >= 1) 
        {
            //calculating the sum of n natural numbers
            int sum = (number * (number + 1)) / 2;
        
            //displaying the sum on output
            System.out.println("The sum of first " + number + " natural numbers is: " + sum);
        }
        else
        {
            System.out.println("The entered number is not a natural number.");
        }
        scanner.close();
    }
}