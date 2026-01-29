package com.setInterface;

import java.util.HashSet;

public class UnionAndIntersaction 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println("Intersaction : "+intersaction(set1,set2));
	    union(set1,set2);
	    System.out.println("Union        : "+set1);
	}
	
	public static HashSet<Integer> intersaction(HashSet<Integer> set1,HashSet<Integer> set2)
	{
		HashSet<Integer> result = new HashSet<>();
		for(int a: set1) {
		  if(set2.contains(a)) {
				result.add(a);
		  }
		}
		
		return result;
	}
	
	
	public static HashSet<Integer> union(HashSet<Integer> set1,HashSet<Integer>set2)
	{
		set1.addAll(set2);
		return set1;
	}
	
}