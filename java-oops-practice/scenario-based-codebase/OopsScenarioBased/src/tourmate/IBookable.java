package tourmate;

public interface IBookable 
{
	String book(int persons);
	void cancel(int persons);

}
