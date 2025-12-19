//program to input marks and 3 subjects physics, chemistry and maths. 
 //Compute the percentage and then calculate the grade using 2D array
 
 
import java.util.*;
public class GradesCalculator2D
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int students = input.nextInt();
		
		// getting input of the subjects
		
		int [][] marks= new int[students][3];
		double [] percentage= new double [students];
		String [] remarks= new String [students];
		
		System.out.println("Enter the marks of Physics, Chemistry and Maths one by one for each student");
		for(int i=0; i<students; i++)
			{
				for(int j=0; j<3; j++)
				{
					marks[i][j]=input.nextInt();
					if(marks[i][j]<0)
					{
						System.out.println("invalid input enter correct marks again");
						j--;
					}
				}
			}
				
		
		  
		//calculating percentage marks and deciding grades
		for(int i=0; i<students; i++)
			{	
				int sum=0;
				for(int j=0; j<3; j++)
				{
					sum  += marks[i][j];
				}
				percentage[i]=(sum/300.0)*100;
				if (percentage[i] >= 80) 
					{
						 
						remarks[i]="Level 4, above agency-normalized standards";
					}
				else if (percentage[i]>=70 && percentage[i]<=79) 
					{
						 
						remarks[i]="Level 3, at agency-normalized standards";
					}
				else if(percentage[i]>=60 && percentage[i]<=69)
					{
						 
						remarks[i] = "Level 2, below, but approaching agency-normalized standards";
					}
				else if (percentage[i]>=50 && percentage[i]<=59) 
					{
						 
						remarks[i]= "Level 1, well below agency-normalized standards";
					}
				else if (percentage[i]>=40 && percentage[i]<=49) 
					{
						 
						remarks[i] = "Level 1-, too below agency-normalized standards";
					}
				else 
				{
					 
					remarks[i]="Remedial standards";
				}
				
			}
		System.out.println("the output is in the format of physics, chemistry, maths, percentage and remarks");
		for(int k=0; k<students; k++)
		{
			for(int l=0; l<students; l++)
			{
				System.out.println(marks[k][l]+" "+marks[k][l]+" "+marks[k][l]+" "+percentage[k]+" "+remarks[k]);
			}
		}
		
		
	}
}