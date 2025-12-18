// a program that takes the base and height to find area of a triangle in square inches and square centimeters 
import java.util.*;
public class AreaOfTriangle{
	public static void main(String args[]){
		
		//creating variable to store  the height and base and taking inputs
		Scanner sc= new Scanner(System.in);
		double height= sc.nextDouble();
		double base= sc.nextDouble();
		
		// calculating area of triangle
		double areaInCm= ((1/2.0)* base * height);
		//converting area in Cm to area in Inches
		double areaInInch= (areaInCm / (2.54 * 2.54));
		
		//displaying output
		System.out.println("Area of the triangle in cm^2 is " + areaInCm + " and in Inch^2 is " + areaInInch);
		}
	}
		

		