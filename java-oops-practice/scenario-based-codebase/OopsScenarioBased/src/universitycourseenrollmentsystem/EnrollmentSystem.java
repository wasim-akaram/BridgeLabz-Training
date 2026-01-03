package universitycourseenrollmentsystem;

public class EnrollmentSystem 
{

    public static void main(String[] args) 
    {

        Course java = new Course("Advanced Java", 4);
        Course ai = new Course("Artificial Intelligence", 5);

        Undergraduate ug = new Undergraduate(101, "Wasim", java);
        Postgraduate pg = new Postgraduate(201, "Akaram", ai);

        Faculty faculty = new Faculty("Dr. Abhishek Purohit");

        Enrollment.enroll(ug, java);
        Enrollment.enroll(pg, ai);

        faculty.gradeStudent(ug, "A");      
        faculty.gradeStudent(pg, "Pass");   

        ug.printTranscript();
        pg.printTranscript();
    }
}
