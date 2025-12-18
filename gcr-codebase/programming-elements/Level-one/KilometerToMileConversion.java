//Create a program to convert distance in kilometers to miles Using 1 mile = 1.6 km formulae 
import java.util.*;
public class KilometerToMileConversion{
	public static void main(String args[]){
 
	Scanner sc= new Scanner(System.in);
	//Creating a variable km
	double km = sc.nextDouble;

	double distanceInMiles= (distanceInKm / (1.6));
	
	//display the output
	System.out.println("The total miles is " + distanceInMiles + " mile for the given " + km + " km");
	}
}
	