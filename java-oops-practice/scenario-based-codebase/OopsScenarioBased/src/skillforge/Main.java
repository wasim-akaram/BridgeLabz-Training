package skillforge;

public class Main 
{

    public static void main(String[] args) 
    {

        Instructor instructor = new Instructor("James", "james@yahoomail.com");

        Course javaCourse = new Course("Java Full stack", instructor);

        Student student = new Student("Wasim", "wasim@gmail.com");

        instructor.uploadCourse("Java Full stack");

        student.completeModule(40);
        student.completeModule(60);
        student.addScore(75);

        javaCourse.showCourseDetails();
        student.generateCertificate();

        System.out.println();


        
    }
}
