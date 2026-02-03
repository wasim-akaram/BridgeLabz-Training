package com.jUnit.performancetesting;

import java.util.concurrent.TimeUnit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TaskProcessorTest 
{

	TaskProcessor processor = new TaskProcessor();

	@Test
	@Timeout(value = 2, unit = TimeUnit.SECONDS)
	void testPerformanceFail() throws InterruptedException 
	{
		processor.longRunningTask();
	}

	@Test
	@Timeout(value = 4, unit = TimeUnit.SECONDS)
	void testPerformancePass() throws InterruptedException 
	{
		processor.longRunningTask();
	}

}