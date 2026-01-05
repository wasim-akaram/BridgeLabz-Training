package com.linkedlist.taskscheduler;


public class Main 
{

    public static void main(String[] args) 
    {

    	TaskLinkedList scheduler = new TaskLinkedList();

        scheduler.addAtEnd(1, "Design Module", 1, "10-Apr");
        scheduler.addAtEnd(2, "Write Code", 2, "12-Apr");
        scheduler.addAtEnd(3, "Testing", 1, "15-Apr");

        scheduler.addAtBeginning(4, "Requirement Analysis", 1, "05-Apr");

        System.out.println("---- All Tasks ----");
        scheduler.displayAllTasks();

        System.out.println("---- View Current Tasks (Round Robin) ----");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        System.out.println("---- Search by Priority ----");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        System.out.println("---- After Deletion ----");
        scheduler.displayAllTasks();
    }
}
