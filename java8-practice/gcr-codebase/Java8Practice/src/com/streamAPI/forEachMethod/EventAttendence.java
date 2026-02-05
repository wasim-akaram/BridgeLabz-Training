package com.streamAPI.forEachMethod;

import java.util.Arrays;
import java.util.List;

public class EventAttendence 
{

	public static void main(String args[])
	{
		List <String> attendees = Arrays.asList(
				"Wasim","Himesh", "Lucky", "Ananya", "Anvesh", "Harshit");
		attendees.stream().forEach(man -> System.out.println("Welcome to the party "+ man));
	}

}
