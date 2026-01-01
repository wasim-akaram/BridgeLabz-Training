package com.objectmodeling.levelone;



public class MainAssociationAndAggregation 
{
    public static void main(String[] args) 
    {

        School school = new School("Galaxy Public School");

        Student s1 = new Student(1, "Vedansh");
        Student s2 = new Student(2, "Vipin");

        Course english = new Course("English");
        Course science = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(english);
        s1.enrollCourse(science);

        s2.enrollCourse(science);

        s1.viewCourses();
        System.out.println();

        s2.viewCourses();
        System.out.println();

        english.showEnrolledStudents();
        System.out.println();

        science.showEnrolledStudents();
    }
}
