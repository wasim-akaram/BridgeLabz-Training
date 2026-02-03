package com.jUnit.testingDateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DateFormatterTest 
{
	DateFormatter formatter = new DateFormatter();

	@Test
	void testFormatDate() 
	{
		assertEquals("25-12-2023", formatter.formatDate("1995-10-25"));
	}

	@Test
	void testInvalidDateFormat() 
	{
		assertThrows(Exception.class, () -> {formatter.formatDate("10-01-2020");});
	}
}