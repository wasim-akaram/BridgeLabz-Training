package com.objectmodeling.levelone;

public class MainOfStudents
{
    public static void main(String[] args) 
    {

        Universities uni = new Universities("Global Tech University");

        Students s1 = new Students(1, "Wasim");
        Students s2 = new Students(2, "Anita");

        Professors p1 = new Professors(101, "Dr. Sharma");

        Courses c1 = new Courses("Data Structures");
        Courses c2 = new Courses("Database Systems");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        p1.assignProfessor(c1);
        p1.assignProfessor(c2);

        System.out.println();
        s1.showCourses();
        System.out.println();
        p1.showCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
