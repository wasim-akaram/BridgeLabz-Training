package com.jUnit.passwordstrengthValidator;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PasswordValidatorTest 
{

	PasswordValidator validator = new PasswordValidator();

	@Test
	void testValidPassword() 
	{
		assertTrue(validator.isValid("Password123"));
	}

	@Test
	void testInvalidPasswords() 
	{
		
		assertFalse(validator.isValid("NoDigitHere"), "No digit");
		assertFalse(validator.isValid(null), "Null password");
	}
}