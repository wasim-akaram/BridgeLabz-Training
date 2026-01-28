package com.listInterface;

import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

public class FrequencyElements {

	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("Banana");
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		list.add("Kiwi");
		list.add("Kiwi");

		Map<String, Integer> map = new HashMap<>();
		
		
		
		for(String str : list) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
				
			} else {
				map.put(str, 1);
			}
		}
		
		System.out.println(map);

	}
}
