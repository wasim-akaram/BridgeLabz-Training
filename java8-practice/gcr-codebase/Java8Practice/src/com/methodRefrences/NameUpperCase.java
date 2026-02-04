package com.methodRefrences;


	import java.util.*;

	import java.util.stream.*;

	public class NameUpperCase 
	{

	    public static void main(String[] args) 
	    {

	        List<String> employeeNames = Arrays.asList(
	            "Wasim",
	            "Akaram",
	            "Rahul",
	            "Anita"
	        );

	
	        List<String> upperCaseNames = employeeNames.stream()
	                .map(String::toUpperCase)
	                .collect(Collectors.toList());

	
	        upperCaseNames.forEach(System.out::println);
	    }
	}	


