package skillforge;

public class Instructor extends User 
{

	public Instructor(String name, String email) 
	{
		super(name, email);
		
	}

	public void displayRole() 
	{
		System.out.println("Role: Instructor");
		
	}
	
	public void uploadCourse(String title) 
	{
        System.out.println(name+" uploaded course: " + title);
    }


}
