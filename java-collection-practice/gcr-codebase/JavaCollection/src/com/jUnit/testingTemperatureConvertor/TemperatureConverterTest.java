package com.jUnit.testingTemperatureConvertor;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TemperatureConverterTest 
{
	TemperatureConverter converter = new TemperatureConverter();

	@Test
	void testConversions() 
	{
		assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
		
		
	}

}