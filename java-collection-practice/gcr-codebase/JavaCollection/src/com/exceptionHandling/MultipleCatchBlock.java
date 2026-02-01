package com.exceptionHandling;
import java.util.Scanner;
import java.io.IOException;
public class MultipleCatchBlock 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		try
		{
			System.out.println("Enter the size of the array");
			int size=sc.nextInt();
			int [] arr = new int[size];
			System.out.println("Enter the elements");
			for (int i =0; i<size; i++)
			{
				arr[i]= sc.nextInt();
			}
			System.out.println("Enter the index");
			int index = sc.nextInt();
			
			System.out.println("Element at the index "+index+" "+arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("Caught ArrayIndexOutOfBoundsException " + exc.getLocalizedMessage());
		}
		catch(NullPointerException ep)
		{
			System.out.println("Caught NullPointerException " + ep.getLocalizedMessage());
		}
	}

}
