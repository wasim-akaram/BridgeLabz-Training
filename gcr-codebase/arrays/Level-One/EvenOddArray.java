// program to save odd and even numbers into odd and even arrays between 1 
//to the number entered by the user



import java.util.*;
public class EvenOddArray
{
    public static void main(String args[])
	{
		//creating object of scanner
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		//array to store numbers 
		//checking if the number is odd or even and then 
		//deciding the size of each array
		int [] even = new int[number%2 ==0? number/2 : number/2];
		int [] odd = new int[number%2 ==0? number/2 : number/2 +1];
		
		//variables to iterate both the arrays in for loop
		int evenVariable=0;
		int oddVariable =0;
		
		//dividing numbers into both the arrays
		for(int i=1; i<= number; i++)
		{
			if(i%2==0)
			{	
				even [evenVariable] = i;
				evenVariable ++;
			}
			else
			{
				odd [oddVariable] = i;
				oddVariable++;
			}
		}
		//displaying results
		System.out.println("Even numbers are");
		for(int j=0; j<even.length; j++)
		{
			System.out.println(even[j]);
		}
			System.out.println("Odd numbers are");
		for(int k=0; k<odd.length; k++)
		{
			System.out.println(odd[k]);
		}
	}
}
				
			