package edumentor;



public abstract class User 
{
    protected String name;
    protected String email;
    protected String userId;

    
    
    
    	public User(String name, String email, String userId)
        {
            this.name = name;
            this.email = email;
            this.userId = userId;
        }

	


	public String getName() 
    {
        return name;
    }
}
