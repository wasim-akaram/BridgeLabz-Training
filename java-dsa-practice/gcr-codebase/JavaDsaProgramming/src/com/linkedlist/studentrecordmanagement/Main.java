package com.linkedlist.studentrecordmanagement;



public class Main
{

    public static void main(String[] args) 
    {

       LinkedListStudent list = new LinkedListStudent();

        list.addAtBeginning(101, "Wasim", 20, 'A');
        list.addAtEnd(102, "Akaram", 21, 'B');
        list.addAtEnd(103, "Rahul", 22, 'C');

        list.addAtPosition(104, "Neha", 19, 'A', 2);

        list.displayAll();

        list.searchByRollNo(102);

        list.updateGrade(103, 'A');

        list.deleteByRollNo(101);

        list.displayAll();
    }
}
