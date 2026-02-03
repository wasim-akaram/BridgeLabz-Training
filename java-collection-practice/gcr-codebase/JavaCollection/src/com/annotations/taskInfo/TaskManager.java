package com.annotations.taskInfo;

public class TaskManager 
{
	@TaskInfo(priority = "Moderate", assignedTo = "Vipin")
	public void highPriorityTask() 
	{
		System.out.println("Moderate priority task executed.");
	}
}