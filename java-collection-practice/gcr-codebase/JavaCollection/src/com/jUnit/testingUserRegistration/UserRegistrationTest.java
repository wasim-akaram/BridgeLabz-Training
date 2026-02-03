package com.jUnit.testingUserRegistration;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class UserRegistrationTest 
{
	UserRegistration registration = new UserRegistration();

	@Test
	void testSuccessfulRegistration() 
	{
		assertTrue(registration.registerUser("wasim", "wasim@yahoomail.com", "password123"));
	}

	@Test
	void testFailedRegistration() 
	{
		assertThrows(IllegalArgumentException.class, () -> {registration.registerUser("vishal", "nomail-email", "123");});
	}

}