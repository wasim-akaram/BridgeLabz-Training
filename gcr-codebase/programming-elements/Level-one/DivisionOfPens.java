/* Write a program to find how many pens each student 
will get if the pens must be divided equally. Also,
 find the remaining non-distributed pens.
*/
public class DivisionOfPens{
	public static void main(String args[]){
	
	//Creating variables to store number of students and pens
	int numberOfStudents = 3, numberOfPens = 14;
	
	//calculating number of pens each student gets and remaining pens
	int penPerStudent = numberOfPens / numberOfStudents;
	int remainingPens = numberOfPens % numberOfStudents;
	
	//displaying the ouput
	System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " +remainingPens );

	}
}
 