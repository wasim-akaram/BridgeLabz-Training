package com.eduresults;

import java.util.Arrays;

public class Main
{
   public static void main(String[] args)
   {
	   Student[] arr = {new Student("Vipin",99),new Student("Vishal",100),new Student("Wasim",15)};
	   System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
   }
   public static Student[] mergeSort(Student[] arr,int start,int end) 
   {
	   if(start>=end)
	   {
		   return new Student[] {arr[end]};
	   }
	   int mid = start+(end-start)/2;
	   Student[] arr1 = mergeSort(arr,start,mid);
	   Student[] arr2 = mergeSort(arr,mid+1,end);
	   return merge(arr1,arr2);
   }
   public static Student[] merge(Student[]arr1,Student[]arr2) 
   {
	   Student[] arr = new Student[arr1.length+arr2.length];
	   int i = 0;
	   int j = 0;
	   int k = 0;
	   
	   while(i<arr1.length&&j<arr2.length) 
	   {
		   if(arr1[i].percentage<arr2[j].percentage) 
		   {
			   arr[k++] = arr1[i++];
		   }
		   else
		   {
			   arr[k++] = arr2[j++];
		   }
	   }
	   
	   while(i<arr1.length) 
	   {
		   arr[k++] = arr1[i++];
	   }
	   while(j<arr2.length)
	   {
		   arr[k++] = arr2[j++];
	   }
	   
	   return arr;
   }
}