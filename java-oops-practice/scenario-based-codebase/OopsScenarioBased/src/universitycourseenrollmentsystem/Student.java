package universitycourseenrollmentsystem;


abstract class Student 
{

    protected int id;
    protected String name;
    protected Course course;

    private double gpa;   // Encapsulation
    private String grade;

    // Constructor
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // Constructor with course
    public Student(int id, String name, Course course) 
    {
        this(id, name);
        this.course = course;
    }

    protected void calculateGPA(double points)
    {
        this.gpa = points / course.getCredits();   
    }

    protected void setGrade(String grade) 
    {
        this.grade = grade;
    }

    // Public access to transcript
    public void printTranscript() 
    {
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course.getCourseName());
        System.out.println("Grade      : " + grade);
        System.out.println("GPA        : " + gpa);
        System.out.println("-------------------------");
    }
}

