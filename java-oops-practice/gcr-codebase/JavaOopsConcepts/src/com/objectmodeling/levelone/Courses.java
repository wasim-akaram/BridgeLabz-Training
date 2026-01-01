package com.objectmodeling.levelone;


import java.util.List;
import java.util.ArrayList;
class Courses 
{
    private String courseName;
    private Professors professor;
    private List<Students> students;

    Courses(String courseName) 
    {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Students student) 
    {
        students.add(student);
    }

    void setProfessor(Professors professor) 
    {
        this.professor = professor;
    }

    String getCourseName() 
    {
        return courseName;
    }

    void showCourseDetails() 
    {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) 
        {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Students:");
        for (Students s : students)
        {
            System.out.println(s.getName());
        }
    }
}
