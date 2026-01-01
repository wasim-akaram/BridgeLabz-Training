package com.objectmodeling.levelone;


import java.util.List;
import java.util.ArrayList;
class Professors 
{
    private int professorId;
    private String name;
    private List<Courses> courses;

    Professors(int professorId, String name) 
    {
        this.professorId = professorId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Communication: professor assigned to course
    void assignProfessor(Courses course) 
    {
        courses.add(course);
        course.setProfessor(this);
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }

    void showCourses() 
    {
        System.out.println("Courses taught by " + name + ":");
        for (Courses c : courses) 
        {
            System.out.println(c.getCourseName());
        }
    }

    String getName() 
    {
        return name;
    }
    int getProfessorId()
    {
    	return professorId;
    }
}
