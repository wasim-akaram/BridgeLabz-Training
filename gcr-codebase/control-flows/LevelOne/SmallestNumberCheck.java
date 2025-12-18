// program to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;
public class SmallestNumberCheck 
{
    public static void main(String[] args) 
    {   
        //create scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        //checking if first number is the smallest and displaying result
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("The first number is the smallest.");
        } else {
            System.out.println("The first number is not the smallest.");
        }

        scanner.close();
    }
}
