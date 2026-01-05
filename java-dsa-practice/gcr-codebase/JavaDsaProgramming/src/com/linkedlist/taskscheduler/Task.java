package com.linkedlist.taskscheduler;



class Task 
{
	 String taskName;
    int taskId;
   
    String dueDate;
    int priority;
   

    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) 
    {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
