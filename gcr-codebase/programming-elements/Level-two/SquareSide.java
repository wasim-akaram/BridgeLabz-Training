//a program to find the side of the square whose perimeter you read from user 

import java.util.Scanner;  
public class SquareSide {  
    public static void main(String[] args) {  

        //taking perimeter of square as input from user
        Scanner scanner = new Scanner(System.in);   
        double perimeter = scanner.nextDouble();  
        double side = perimeter / 4;  

        //displaying the side of square
        System.out.println("The side of the square is: " + side);  
    }  
}