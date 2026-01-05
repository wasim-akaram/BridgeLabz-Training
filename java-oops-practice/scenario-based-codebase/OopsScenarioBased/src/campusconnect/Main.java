package campusconnect;



public class Main 
{

    public static void main(String[] args) 
    {

        Faculty faculty = new Faculty(001,"Dr. Abhishek Purohit",
                "sharma@university.edu",
                "Computer Science"
        );

        Course course = new Course(
                "CS101",
                "Object Oriented Programming",
                faculty
        );

        Student s1 = new Student(101, "Wasim", "wasim@student.edu");
        Student s2 = new Student(102, "Akaram", "akaram@student.edu");

        s1.enrollCourse(course);
        s2.enrollCourse(course);

        s1.addGrade(8.5);
        s1.addGrade(9.0);
        s2.addGrade(7.5);
        s2.addGrade(8.0);

        System.out.println("----- Student Details -----");
        s1.printDetails();
        System.out.println();
        s2.printDetails();

        System.out.println("\n----- Faculty Details -----");
        faculty.printDetails();

        System.out.println("\n----- Course Details -----");
        course.printCourseDetails();
    }
}
