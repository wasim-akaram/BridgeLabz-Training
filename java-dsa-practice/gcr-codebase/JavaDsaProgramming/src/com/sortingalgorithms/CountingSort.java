package com.sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort
{

    public static void countingSort(int[] ages) {

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        
        for (int age : ages) {
            count[age - minAge]++;
        }

        
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

       
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy sorted data back
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = sc.nextInt();
		
		System.out.println("Enter their ages");
		int [] ageArray = new int[number];
		
		for(int i=0; i<number; i++)
		{
			ageArray[i] = sc.nextInt();
		}
		
		countingSort(ageArray);
		
		//printing the results
		System.out.println("The marks in sorted order is");
		 System.out.println(Arrays.toString(ageArray));
		
		sc.close();
	}

}
