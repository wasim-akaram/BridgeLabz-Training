package universitycourseenrollmentsystem;

class Undergraduate extends Student implements Graded 
{

    public Undergraduate(int id, String name, Course course) 
    {
        super(id, name, course);
    }

    

    public void assignGrade(String grade) 
    {
        setGrade(grade);

        if (grade.equals("A"))
            calculateGPA(40);
        else if (grade.equals("B"))
            calculateGPA(30);
        else
            calculateGPA(20);
    }
}
