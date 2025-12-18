import java.util.*;
public class KilometerToMileConverter{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the distance in Km");
	double distanceInKm= sc.nextDouble();
	double distanceInMiles= distanceInKm * 0.621371;
	System.out.println("The distance in miles is " + distanceInMiles);
	}
}
	