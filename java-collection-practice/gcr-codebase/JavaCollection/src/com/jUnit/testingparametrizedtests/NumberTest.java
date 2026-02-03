package com.jUnit.testingparametrizedtests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberTest 
{
	Number obj = new Number();

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8, 10 })
	void testIsEvenWithEvenNumbers(int number) 
	{
		assertTrue(obj.isEven(number));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 3, 5, 7, 9 })
	void testIsEvenWithOddNumbers(int number) 
	{
		assertFalse(obj.isEven(number));
	}
}