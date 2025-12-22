// program to find the maximum number of handshakes among students.

import java.util.*;
public class Handshakes {

    // Method To calculate maximum handshakes
    public int calculateHandshake(int people) 
	{
        
		//calculate handshakes
		int handshakes = (people * ( people -1)) /2;

        // return the value
        return handshakes;
    }

    public static void main(String[] args)
	{
	
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for people
        System.out.print("Enter the number of people: ");
        int people = sc.nextInt();
		
		//creating object of class Handshakes
		Handshakes findHandshakes =new Handshakes();
		
		//call the method
		int result= findHandshakes.calculateHandshake(people);
		
		//display the result
		System.out.println("Total handshakes " + result);
		
		sc.close();
	}
}