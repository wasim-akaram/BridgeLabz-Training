//a program to create a basic calculator that can perform addition, subtraction, multiplication, and division
// Importing dependencies for taking user input
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		
		// Taking the inputs
		Scanner input = new Scanner(System.in);
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		
		//Performing additin, subtraction, division amd multiplication operations on both the inputs
		float add = number1 + number2;
		float subtract = number1 - number2;
		float divide = number1 / number2;
		float multiply = number1 * number2;
		
		//Displaying the result of all these operations
		System.out.println("The addition, subtraction, multiplication and division value of two numbers " + number1 + " and " + number2 + " is " + add + ", " + subtract + ", " + multiply + " and " + divide);

	}
}