package com.streamAPI.forEachMethod;


import java.util.Arrays;
import java.util.List;

public class EmailNotificationService 
{
	public static void main(String args[])
	{
		List<String>email = Arrays.asList("wasim@mail.com",
				"anvesh@gmail.com", "vishal@yahoomail.com", "vipin@outlook.com");
		
		email.stream()
			.forEach(id ->sendEmailNotification(id));
		
		
		
	}
	public static void sendEmailNotification(String id)
	{
		System.out.println("Notification on gmail" + id);
	}

}
