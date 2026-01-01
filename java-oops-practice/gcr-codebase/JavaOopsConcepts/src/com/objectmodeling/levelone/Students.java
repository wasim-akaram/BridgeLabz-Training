package com.objectmodeling.levelone;



import java.util.List;
import java.util.ArrayList;

class Students 
{
    private int studentId;
    private String name;
    private List<Courses> courses;

    Students(int studentId, String name) 
    {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Communication: student enrolls in course
    void enrollCourse(Courses course) 
    {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    void showCourses() 
    {
        System.out.println("Courses enrolled by " + name + ":");
        for (Courses c : courses) 
        {
            System.out.println(c.getCourseName());
        }
    }

    String getName() 
    {
        return name;
    }
    int getStudentId() 
    {
        return studentId;
    }
}
