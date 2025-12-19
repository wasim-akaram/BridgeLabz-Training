//program to input marks and 3 subjects physics, chemistry and maths. 
 //Compute the percentage and then calculate the grade
 
 
import java.util.*;
public class GradesCalculator
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int students = input.nextInt();
		
		// getting input of the subjects
		
		int [] physics= new int[students];
        int [] chemistry = new int[students];
        int [] maths = new int[students];
		double [] percentage= new double [students];
		String [] remarks= new String [students];
		
        System.out.println("Enter the marks of physics");
		for(int i=0 ; i< students; i++)
		{
			physics [i] = input.nextInt();
			if(physics[i]<0)
			{
				System.out.println("invalid input enter correct marks again");
				i--;
			}
				
		}
    
		System.out.println("Enter the marks of chemistry");
		for(int i=0 ; i< students; i++)
		{
			physics [i] = input.nextInt();
			if(chemistry[i]<0)
			{
				System.out.println("invalid input enter correct marks again");
				i--;
			}
				
		}
		 
		System.out.println("Enter the marks of maths");
		for(int i=0 ; i< students; i++)
		{
			physics [i] = input.nextInt();
			if(maths[i]<0)
			{
				System.out.println("invalid input enter correct marks again");
				i--;
			}
				
		}
		  
		  
		//calculating percentage marks and deciding grades
		for(int i=0; i<students; i++)
			{	
				percentage[i]=((physics[i] + chemistry[i] + maths[i])/300.0)*100;
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
			System.out.println(physics[k]+" "+chemistry[k]+" "+maths[k]+" "+percentage[k]+" "+remarks[k]);
		}
		
	}
}