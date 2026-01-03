package universitycourseenrollmentsystem;

class Postgraduate extends Student implements Graded 
{

    public Postgraduate(int id, String name, Course course) 
    {
        super(id, name, course);
    }

    
    public void assignGrade(String grade)
    {
        setGrade(grade);

        if (grade.equalsIgnoreCase("Pass"))
            calculateGPA(35);
        else
            calculateGPA(0);
    }
}
