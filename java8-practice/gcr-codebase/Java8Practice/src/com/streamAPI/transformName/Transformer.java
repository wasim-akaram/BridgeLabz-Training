package com.streamAPI.transformName;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transformer 
{
	public static void  main(String [] args)
	{
		List <String > name = Arrays.asList("Vishal", "Vipin","Anvesh", "Ananya","Harshit" );
		
		List <String> sortedCustomers = name.stream()
				
				//.map(String :: toUpperCase)
				.map(n -> n.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		sortedCustomers.forEach(System.out::println);
	}

}
