package com.jUnit.testingStringUtilitymethods;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class StringUtilityTest 
{
	StringUtility obj = new StringUtility();
	
	@Test
	void testReverseString()
	{
		assertEquals("wasim", obj.reverseString("misaw"));
	}
	
	@Test
	void testPalindromeString()
	{
		assertEquals(true, obj.isPalindrome("121"));
	}
	
	@Test
	void testToUpperCase()
	{
		assertEquals("WASIM", obj.toUpperCase("wasim"));
	}
	

}
