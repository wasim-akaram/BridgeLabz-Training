package campusconnect;



import java.util.ArrayList;
import java.util.List;

class Course 
{

    private String courseCode;
    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    public Course(String courseCode, String courseName, Faculty faculty) 
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printCourseDetails() {
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
        System.out.println("Faculty     : " + faculty.name);
        System.out.println("Enrolled Students: " + students.size());
    }
}
