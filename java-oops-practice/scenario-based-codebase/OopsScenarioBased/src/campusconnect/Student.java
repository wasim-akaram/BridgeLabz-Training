package campusconnect;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements CourseAction
{

    private List<Course> courses;   // enrolled courses
    private List<Double> grades;    // private → encapsulation

    public Student(int id, String name, String email) 
    {
        super(id, name, email);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    @Override
    public void enrollCourse(Course course) 
    {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    // Add grade (controlled access)
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();   // operator usage
    }

    // Polymorphism
    @Override
    public void printDetails() {
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Email        : " + email);
        System.out.println("GPA          : " + calculateGPA());
    }
}
