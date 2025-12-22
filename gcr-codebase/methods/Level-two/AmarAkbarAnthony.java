//program to find the youngest friends among 3 Amar, Akbar and Anthony based 
//on their ages and tallest among the friends based on their heights and display it

import java.util.*;
public class AmarAkbarAnthony
{
	public static float tallestHeight(float[] height)
	{
		float max = height[0];
		for(float a :height)
		{
			max = Math.max(max,a);
		}
		return max;
	}
	
	public static int minimumAge(int[] age){
		int min =age[0];
		for(int i :age)
		{
			min = Math.min(min,i);
		}
		return min;
	}
	
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int [] age = new int[3];
		float [] height = new float[3];
		
		System.out.println("Enter the ages :");
		for(int i =0; i<3; i++)
			{
				age[i] = sc.nextInt();
			}
		
		System.out.println("Enter the Height of Amar, Akbar, Anthony :");
		for(int j =0; j<3; j++)
			{
				height[j] = sc.nextInt();
			}
			
	   System.out.println("The youngest person age is "+minimumAge(age));
	   System.out.println("The tallest person height is "+tallestHeight(height));
	}
}