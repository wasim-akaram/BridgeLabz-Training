package com.objectmodeling.levelone;



import java.util.List;
import java.util.ArrayList;
class Course 
{
    private String courseName;
    private List<Student> enrolledStudents;

    Course(String courseName) 
    {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void addStudent(Student student) 
    {
        enrolledStudents.add(student);
    }

    void showEnrolledStudents() 
    {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) 
        {
            System.out.println("Student: " + s.getName());
        }
    }

    String getCourseName() 
    {
        return courseName;
    }
}
