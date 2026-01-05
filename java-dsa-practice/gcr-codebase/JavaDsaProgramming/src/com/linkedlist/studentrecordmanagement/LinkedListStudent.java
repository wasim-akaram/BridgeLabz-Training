package com.linkedlist.studentrecordmanagement;



class LinkedListStudent 
{

    private StudentNode head;

    // Add at Beginning
    public void addAtBeginning(int rollNo, String name, int age, char grade) 
    {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(int rollNo, String name, int age, char grade) 
    {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) 
        {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at Specific Position (1-based index)
    public void addAtPosition(int rollNo, String name, int age, char grade, int position)
    {
        if (position <= 0) 
        {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) 
        {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) 
        {
            temp = temp.next;
        }

        if (temp == null) 
        {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNo(int rollNo) 
    {
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == rollNo) 
        {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        StudentNode prev = head;
        StudentNode curr = head.next;

        while (curr != null && curr.rollNo != rollNo) 
        {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) 
        {
            System.out.println("Student not found");
            return;
        }

        prev.next = curr.next;
        curr.next = null; 
        System.out.println("Student deleted");
    }

    //Search by Roll Number
    public void searchByRollNo(int rollNo) 
    {
        StudentNode temp = head;

        while (temp != null) 
        {
            if (temp.rollNo == rollNo) 
            {
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Update Grade
    public void updateGrade(int rollNo, char newGrade) 
    {
        StudentNode temp = head;

        while (temp != null) 
        {
            if (temp.rollNo == rollNo) 
            {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Display All Records
    public void displayAll() 
    {
        if (head == null) 
        {
            System.out.println("No student records available");
            return;
        }

        StudentNode temp = head;
        while (temp != null) 
        {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    // Helper Method
    private void displayStudent(StudentNode s) 
    {
     
        System.out.println("Roll No : " + s.rollNo);
        System.out.println("Name    : " + s.name);
        System.out.println("Age     : " + s.age);
        System.out.println("Grade   : " + s.grade);
    }
}
