//a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;
public class FeetToYardsAndMilesConverter {
    public static void main(String[] args) {

        // Taking user input for distance in feet
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();

        // Converting feet to yards and miles
        double yards = feet / 3;
        double miles = feet / 5280;

        // Displaying the results
       System.out.println("The distance in yards is: " + yards + "and in miles is: " + miles);
    }
}