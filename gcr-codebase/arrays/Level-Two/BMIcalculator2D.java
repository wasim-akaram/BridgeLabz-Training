//bMI[i] program using 2d array


import java.util.*;
public class BMIcalculator2D
{
	public static void main(String args[])
	{
		//creating object of scanner
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number of people in the team");
		int number = input.nextInt();
		
		double [][] personData = new double[number][3];
		String [] status = new String[number];
		
		System.out.println("Enter the weight and height one by one for each member");
		for(int i=0; i<number; i++)
			{
				
				for(int j=0; j<2; j++)
				{
					
					personData[i][j]=input.nextInt();
					if(personData[i][j]<0)
					{
						System.out.println("invalid input enter correct marks again");
						j--;
					}
				
				}
				
			}
			
			//calculating BMI and inserting in data
		for(int i=0; i<number; i++)
		{
			personData[i][2]=personData[i][0]/((personData[i][1]/100)*(personData[i][1]/100));
			if( personData[i][2] >=40)
			{
				status[i] = " Obese";
			}
			else if( personData[i][2] >= 25 && personData[i][2] < 40)
			{
				status[i] =" Overweight";
			}
			else if( personData[i][2] >= 18.5 && personData[i][2] < 25)
			{
				status[i] = " Normal";
			}
			else if( personData[i][2] <= 18.4)
			{
				status[i] = "Underweight";
			}
		}
		
		
		System.out.println("the result is below in format of weight, height, BMI, and weight status");
		for (int i=0; i<number; i++)
		{
			
				System.out.println(personData[i][0] + " "+personData[i][1]+" "+personData[i][2]+" "+status[i]);
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		