package universitycourseenrollmentsystem;

class Enrollment
{

    public static void enroll(Student student, Course course) 
    {
        student.course = course;
        System.out.println(student.name + " enrolled in " + course.getCourseName());
    }
}
