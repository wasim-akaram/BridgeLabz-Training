package universitycourseenrollmentsystem;


class Faculty 
{

    private String facultyName;

    public Faculty(String facultyName) 
    {
        this.facultyName = facultyName;
    }

    public void gradeStudent(Graded student, String grade) 
    {
    	//polymorphism
        student.assignGrade(grade);   
        System.out.println(facultyName + " assigned grade: " + grade);
    }
}

