package com.mapInterface;

import java.util.ArrayList;
import java.util.HashMap;

public class InvertMap 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map = new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",1);
		
		HashMap<Integer,ArrayList<String>> map2 = new HashMap<>();
		for(var a: map.entrySet()) 
		{
			if(map2.containsKey(a.getValue())) 
			{
				ArrayList<String> arr = new ArrayList<>();
				arr.add(a.getKey());
				arr.addAll(map2.get(a.getValue()));
				map2.put(a.getValue(), arr);
			}
			else 
			{
				ArrayList<String> arr = new ArrayList<>();
				arr.add(a.getKey());
				map2.put(a.getValue(), arr);
			}
		}
		System.out.println("Input  : "+map);
		System.out.println("Output : "+map2);
	}
}