import java.util.*;
//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
// O/P => Harry's age in 2024 is ___
class AgeOfHarry{
	public static void main(String[] args){
		// declare variables
		int currentYear = 2024;
		int birthYear = 2000;

		//calculating the age
		int age = currentYear - birthYear;

		//printing the age
		System.out.println("Harry's age in 2024 is " + age);

	}
}