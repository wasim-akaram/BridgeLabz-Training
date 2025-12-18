//a program the find the distance in yards and miles for the distance provided by user in feets
//given that 1 mile = 1760 yards and 1 yard is 3 feet


import java.util.Scanner;
public class FeetToYardsAndMilesConverter {
    public static void main(String[] args) {

        // Taking user input for distance in feet
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextDouble();

        // Converting feet to yards and miles.
        double yards = distanceInFeet / 3;
        double miles = yards/1760;

        // Displaying the results
       System.out.println("The distance in yards is: " + yards + "and in miles is: " + miles);
    }
}