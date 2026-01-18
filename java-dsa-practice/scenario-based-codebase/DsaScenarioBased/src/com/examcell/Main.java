package com.examcell;
public class Main 
{

    public static void main(String[] args) 
    {

        Student[] students = {
            new Student(101, 85),
            new Student(102, 92),
            new Student(103, 78),
            new Student(104, 95),
            new Student(105, 88)
        };

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(students, 0, students.length - 1);

        System.out.println("State-Level Rank List:");
        int rank = 1;
        for (Student s : students) 
        {
            System.out.println("Rank " + rank++ +
                    " | Roll No: " + s.rollNo +
                    " | Score: " + s.score);
        }
    }
}
