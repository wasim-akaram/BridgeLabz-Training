package com.jUnit.filehandlingtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileHandlingTest 
{

	FileHandler processor = new FileHandler();
	String testFile = "junit_test.txt";

	@Test
	void testWriteAndRead() throws IOException 
	{
		String data = "Hello, Eclipse and JUnit!";

		processor.writeToFile(testFile, data);
		String result = processor.readFromFile(testFile);

		assertEquals(data, result);

	}

	@Test
	void testFileNotFoundThrowsException() 
	{
		assertThrows(IOException.class, () ->{ processor.readFromFile("non_existent_file.txt");});
	}

}