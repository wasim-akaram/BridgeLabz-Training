package com.mapInterface;

import java.util.HashMap;

public class WordFrequencyCounter 
{
	public static void main(String[] args)
	{
		String s = "Hello world, and  hello everyone!";
		s = s.toLowerCase();
		StringBuilder str = new StringBuilder();
		int idx = 0;
		while(idx<s.length()) 
		{
			char ch = s.charAt(idx);
			if(Character.isAlphabetic(ch)||ch==' ') 
			{
				str.append(ch);
			}
			idx++;
		}
		
		String[] arr = str.toString().split(" ");
		HashMap<String,Integer> map = new HashMap<>();
		for(String a : arr) {
			if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}else {
				map.put(a,1);
			}
			
		}
		System.out.println("Frequency of word : "+map);
	}
}