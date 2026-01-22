package com.flashdealz;

import java.util.Arrays;

public class Main 
{
	public static void main(String [] args) 
	{
		Product[] arr = {new Product(101,"S24 Ultra",45),new Product(102,"TV",95),new Product(103,"Asus Zenbook",35)};
		quick(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quick(Product[] arr,int start,int end) 
	{
		if(start>=end)
		{
			return;
		}
		
		int i = start-1;
		int j = start;
		double pivot = arr[arr.length-1].discount;
		while(j<end) {
			if(arr[j].discount<pivot) 
			{
				i+=1;
				Product temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp; 
			}
			j++;
		}
		i+=1;
		Product temp = arr[end];
		arr[end] = arr[i];
		arr[i] = temp;
		
		quick(arr,start,i-1);
		quick(arr,i+1,end);
	}
}