package com.objectmodeling.levelone;


import java.util.ArrayList;
import java.util.List;

class Universities 
{
    private String universityName;
    private List<Students> students;
    private List<Professors> professors;

    Universities(String universityName) 
    {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    void addStudent(Students student)
    {
        students.add(student);
    }

    void addProfessor(Professors professor) 
    {
        professors.add(professor);
    }

    void displayUniversityInfo() 
    {
        System.out.println("University: " + universityName);
        System.out.println("Students Count: " + students.size());
        System.out.println("Professors Count: " + professors.size());
    }
}
