package com.linkedlist.taskscheduler;



class TaskLinkedList 
{

    private Task head;
    private Task tail;
    private Task current;  

    // 1. Add at Beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newNode = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    // 2. Add at End
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newNode = new Task(id, name, priority, dueDate);

        if (head == null) 
        {
            head = tail = current = newNode;
            newNode.next = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // 3. Add at Specific Position (1-based)
    public void addAtPosition(int id, String name, int priority, String dueDate, int position) 
    {
        if (position <= 0) 
        {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) 
        {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) 
        {
            temp = temp.next;
        }

        Task newNode = new Task(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) 
        {
            tail = newNode;
        }
    }

    // 4. Remove Task by Task ID
    public void removeByTaskId(int taskId) 
    {
        if (head == null) 
        {
            System.out.println("Task list is empty");
            return;
        }

        // Single node case
        if (head == tail && head.taskId == taskId) 
        {
            head = tail = current = null;
            System.out.println("Task removed");
            return;
        }

        // Remove head
        if (head.taskId == taskId) 
        {
            head = head.next;
            tail.next = head;
            System.out.println("Task removed");
            return;
        }

        Task prev = head;
        Task curr = head.next;

        while (curr != head && curr.taskId != taskId) 
        {
            prev = curr;
            curr = curr.next;
        }

        if (curr == head) 
        {
            System.out.println("Task not found");
            return;
        }

        prev.next = curr.next;

        if (curr == tail) 
        {
            tail = prev;
        }

        if (curr == current) 
        {
            current = curr.next;
        }

        curr.next = null; // good practice
        System.out.println("Task removed");
    }

    // 5. View Current Task & Move to Next
    public void viewCurrentTask() 
    {
        if (current == null) 
        {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("---- Current Task ----");
        displayTask(current);
        current = current.next;
    }

    // 6. Display All Tasks
    public void displayAllTasks()
    {
        if (head == null)
        {
            System.out.println("No tasks to display");
            return;
        }

        Task temp = head;
        do 
        {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // 7. Search Task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    // Helper Method
    private void displayTask(Task t) 
    {
    
        System.out.println("Task ID   : " + t.taskId);
        System.out.println("Task Name : " + t.taskName);
        System.out.println("Priority  : " + t.priority);
        System.out.println("Due Date  : " + t.dueDate);
    }
}
