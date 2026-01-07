package com.sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{

	
    public static void selectionSort(int[] scores) 
    {
        int n = scores.length;

       
        for (int i = 0; i < n - 1; i++) {

          
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

           
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = sc.nextInt();
		
		System.out.println("Enter their marks");
		int [] marksArray = new int[number];
		
		for(int i=0; i<number; i++)
		{
			marksArray[i] = sc.nextInt();
		}
		
		selectionSort(marksArray);
		
		//printing the results
		System.out.println("The marks in sorted order is");
		 System.out.println(Arrays.toString(marksArray));
		
		sc.close();
	}

}
