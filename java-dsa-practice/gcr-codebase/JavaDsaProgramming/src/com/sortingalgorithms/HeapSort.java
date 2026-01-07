package com.sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort
{

    // Main method to perform heap sort
    public static void heapSort(int[] salaries) 
    {
        int n = salaries.length;

       
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

     
        for (int i = n - 1; i > 0; i--) {

            // Move current root (largest) to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify subtree rooted at index i
    private static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check right child
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If root is not largest, swap and continue heapifying
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, heapSize, largest);
        }
    }

    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int number = sc.nextInt();
		
		System.out.println("Enter their demands");
		int [] demandArray = new int[number];
		
		for(int i=0; i<number; i++)
		{
			demandArray[i] = sc.nextInt();
		}
		
		heapSort(demandArray);
		
		//printing the results
		System.out.println("The demand in sorted order is");
		 System.out.println(Arrays.toString(demandArray));
		
		sc.close();
	}

}
