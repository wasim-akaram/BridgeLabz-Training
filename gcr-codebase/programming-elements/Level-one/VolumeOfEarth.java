//Write a Program to compute the volume of Earth in km^3 and miles^3
public class VolumeOfEarth{
	public static void main(String args[]){
	
	//creating variables for radius and pi
	double radiusInKm = 6378, pi=3.14, radiusInMile = radiusInKm * 0.621371;
	
	//calculating volume in km^3 and mile^3
	double volumeInCukm = (4/3) * pi * radiusInKm * radiusInKm * radiusInKm;
	double volumeInCuMile = (4/3) * pi * radiusInMile * radiusInMile * radiusInMile;
	
	//displaying the output
	System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", volumeInCukm) + " and cubic miles is " + String.format("%.2f", volumeInCuMile) );
	}
}

	