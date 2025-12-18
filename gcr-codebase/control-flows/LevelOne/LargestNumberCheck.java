//a program to check if the first, second, or third number is the largest of the three.

import java.util.Scanner;
public class LargestNumberCheck 
{
    public static void main(String[] args) 
    {   
        //creating scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        //checking which is the largest number and displaying result on output
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The first number is the largest.");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The second number is the largest.");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The third number is the largest.");
        } else {
            System.out.println("Two numbers are equal.");
        }
        scanner.close();
    }
}