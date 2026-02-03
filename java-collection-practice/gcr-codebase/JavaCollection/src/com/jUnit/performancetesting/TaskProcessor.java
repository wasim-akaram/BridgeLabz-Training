package com.jUnit.performancetesting;

public class TaskProcessor 
{
	public void longRunningTask() throws InterruptedException 
	{
		Thread.sleep(3000);
	}
}