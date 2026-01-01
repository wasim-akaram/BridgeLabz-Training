package com.objectmodeling.levelone;




import java.util.List;
import java.util.ArrayList;
class Student 
{
    private int studentId;
    private String name;
    private List<Course> courses;

    Student(int studentId, String name) 
    {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course course) 
    {
        courses.add(course);
        course.addStudent(this); //  association
    }

    void viewCourses() 
    {
        System.out.println("Student: " + name);
        for (Course c : courses) 
        {
            System.out.println("Course: " + c.getCourseName());
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
