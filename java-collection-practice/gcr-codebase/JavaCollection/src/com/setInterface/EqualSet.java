package com.setInterface;

import java.util.HashSet;
import java.util.Set;

public class EqualSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		set1.add("Yellow");
		set1.add("Green");
		set1.add("Blue");
		set1.add("Brown");
		set1.add("Red");
		set1.add("Purple");
		
		set2.add("Brown");
		set2.add("Red");
		set2.add("Purple");
		set2.add("Yellow");
		set2.add("Green");
		set2.add("Blue");
		
		
		
		
		if(check(set1,set2))
		{
			System.out.println("The Sets are equal");
		}
		else 
		{
			System.out.println("The sets are not equal");
		}
	}
	public static boolean check(Set<String> set1,Set<String> set2) {
		for(String a: set1) 
		{
			if(!set2.contains(a)) 
			{
				return false;
			}
		}
		return true;
	}
}