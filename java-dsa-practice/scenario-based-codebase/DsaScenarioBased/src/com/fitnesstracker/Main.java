package com.fitnesstracker;

import java.util.Arrays;

public class Main 
{
	public static void main(String[] args) 
	{
		User [] arr = {new User(101,10242l),new User(102,78563l),new User(103,78945612l)};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(User[]arr) 
	{
		for(int i =0;i<arr.length;i++) 
		{
			for(int j =i;j<arr.length-1;j++) 
			{
				if(arr[j].steps>arr[j+1].steps) 
				{
					User user = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = user;
				}
			}
		}
	}
}