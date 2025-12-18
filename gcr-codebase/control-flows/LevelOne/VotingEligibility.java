//program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

import java.util.Scanner;

public class VotingEligibility 
{
    public static void main(String[] args) 
    {
        //creating scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        //taking age as input from user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //checking if age is greater than or equal to 18
        if (age >= 18) 
        {
            System.out.println("The person's age is " + age + " and can vote.");
        }
         else 
        {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        scanner.close();
    }
}