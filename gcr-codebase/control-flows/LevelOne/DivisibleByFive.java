//program to check if a number is divisible by 5

import java.util.Scanner;

public class DivisibleByFive
{
    public static void main(String[] args) 
    {   
        //creating scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        //taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        //checking divisibility by 5 and displaying result
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
        
        scanner.close();
    }
}
