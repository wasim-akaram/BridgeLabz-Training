package com.reflection.advanced.MethodExecutionTime;

public class SlowTask 
{
	public void process() throws InterruptedException 
	{
		Thread.sleep(500);
	}
}