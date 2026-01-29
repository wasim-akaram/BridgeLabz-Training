package com.mapInterface;

import java.util.HashMap;

public class MergeMap
{
   public static void main(String[]args) 
   {
	  HashMap<String,Integer> map = new HashMap<>();
	  map.put("A",1);
	  map.put("B", 3);
	  
	  
	  HashMap<String,Integer> map2 = new HashMap<>();
	  map2.put("B", 2);
	  map2.put("C",4);
	  
	  
	  System.out.println("Map - 1 : "+map);
	  System.out.println("Map - 2 : "+map2);
	  
	  
	  for(var a: map2.entrySet()) 
	  {
		  if(map.containsKey(a.getKey())) 
		  {
			  map.put(a.getKey(),map.get(a.getKey())+a.getValue());
		  }
		  else 
		  {
			  map.put(a.getKey(),a.getValue());
		  }
	  }
	  System.out.println("Result  : "+map);
   }
}