package edumentor;


public class Learner extends User implements ICertifiable
{

    private String courseType; 

    
   
    	public Learner(String name, String email, String userId, String courseType) 
        {
            super(name, email, userId);
            this.courseType = courseType;
        }

	


	@Override
    public void generateCertificate() 
    {
        if (courseType.equalsIgnoreCase("short")) 
        {
            System.out.println("Short time course certificate generated for " + name);
        } 
        else 
        {
            System.out.println(" Full-Time Course Certificate generated for " + name);
        }
    }
	
	public void getDetails()
	{
		System.out.println("Name: " +name );
		System.out.println("Email: " +email );
		System.out.println("Coursetype: " +courseType );
	}
}
