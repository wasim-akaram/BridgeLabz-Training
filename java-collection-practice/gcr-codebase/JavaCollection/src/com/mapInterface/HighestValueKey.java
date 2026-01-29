package com.mapInterface;

import java.util.HashMap;

public class HighestValueKey {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("A",10);
		map.put("B", 20);
		map.put("C", 15);
		
		String s ="";
		int max = Integer.MIN_VALUE;
		for(var a: map.entrySet()) {
			if(max<a.getValue()) {
				s = a.getKey();
				max =a.getValue();
			}
		}
		System.out.println(max==Integer.MIN_VALUE ? "The List is empty ":s);
	}
}