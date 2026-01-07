package edumentor;


public class Instructor extends User 
{

    private String expertise;

    public Instructor(String name, String email, String userId, String expertise) 
    {
        super(name, email, userId);
        this.expertise = expertise;
    }
    
    public String getExpertise()
    {
    	return expertise;
    }
}

