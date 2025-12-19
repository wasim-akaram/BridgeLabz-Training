 //program to input marks and 3 subjects physics, chemistry and maths. 
 //Compute the percentage and then calculate the grade
 
 
import java.util.Scanner;
public class GradeCalculator
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting input of the subjects
        System.out.println("Enter the marks of physics, chemistry, and maths");
        int physics= input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();
		
		//calculating average marks and deciding grades
		
		double Average=((physics + chemistry + maths)/300.0)*100;
        if (Average >= 80) 
			{
				System.out.println("Level 4, above agency-normalized standards");
			}
        else if (Average>=70 && Average<=79) 
			{
				System.out.println("Level 3, at agency-normalized standards");
			}
		else if(Average>=60 && Average<=69)
			{
				System.out.println("Level 2, below, but approaching agency-normalized standards");
			}
        else if (Average>=50 && Average<=59) 
			{
				System.out.println("Level 1, well below agency-normalized standards");
			}
	    else if (Average>=40 && Average<=49) 
			{
				System.out.println("Level 1-, too below agency-normalized standards");
			}
		else {
            System.out.println("Remedial standards");
		}
		
	}
}