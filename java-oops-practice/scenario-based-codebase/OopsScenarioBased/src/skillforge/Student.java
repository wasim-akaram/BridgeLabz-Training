package skillforge;

public class Student extends User implements ICertifiable
{

	 private int progress;  
	 private int score;
	 
	 
	public Student(String name, String email) 
	{
		super(name, email);
		this.progress = 0;
		this.score = 0;
		
	}

	@Override
	public void displayRole() 
	{
		System.out.println("Role: student");
		
	}
	


    public void completeModule(int moduleWeight) 
    {
        progress += moduleWeight;
    }



    public void addScore(int marks) 
    {
        score += marks;
    }

    @Override
    public void generateCertificate() 
    {
        if (progress >= 100 && score >= 60) 
        {
            System.out.println("Certificate Generated: Course Completion Certificate");
        } 
        else
        {
            System.out.println("Course not completed yet.");
        }
    }

    
}

	
	
	

	


