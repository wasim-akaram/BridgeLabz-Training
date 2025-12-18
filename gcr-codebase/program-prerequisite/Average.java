import java.util.*;
public class Average{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the three numbers");
	int number1= sc.nextInt();
	int number2= sc.nextInt();
	int number3= sc.nextInt();
	// calculating average
	int average=(number1 + number2 + number3 )/3;
	System.out.println("The average of three numbers is " + average);
	}
}