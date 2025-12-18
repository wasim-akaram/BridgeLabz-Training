//a program to find the maximum number of handshakes among N number of students
import java.util.Scanner;
public class Handshakes{
	public static void main(String[] args){

        // Taking number of students as input
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();

        // Calculating maximum number of handshakes
		int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("Maximum number of handshakes possible is " + maxHandshakes);
	}
}