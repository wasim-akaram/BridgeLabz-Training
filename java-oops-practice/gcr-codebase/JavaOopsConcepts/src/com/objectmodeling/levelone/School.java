package com.objectmodeling.levelone;




import java.util.List;
import java.util.ArrayList;

class School 
{
    private String schoolName;
    private List<Student> students;

    School(String schoolName) 
    {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student)
    {
        students.add(student);
    }

    void showStudents() 
    {
        System.out.println("School: " + schoolName);
        for (Student s : students) 
        {
            System.out.println("Student: " + s.getName());
        }
    }
}


