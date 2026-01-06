package com.sortingalgorithms;

import java.util.*;
public class InsertionSort 
{
	public static void insertionSort(int[] arr) 
	{
        int n = arr.length;
        for (int i = 1; i < n; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            // Move elements that are greater than key to one position ahead
            
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int numberOfEmployees = sc.nextInt();
        System.out.println("enter the employee IDs");
        int [] employeeIdArray= new int[numberOfEmployees];
        for(int i=0; i< numberOfEmployees; i++)
        {
        	employeeIdArray[i] = sc.nextInt();
        }
        insertionSort(employeeIdArray);
        System.out.println(Arrays.toString(employeeIdArray));
        
        sc.close();
     }


}
