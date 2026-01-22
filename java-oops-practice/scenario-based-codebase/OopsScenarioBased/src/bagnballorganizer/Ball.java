package bagnballorganizer;

public class Ball 
{
	public int id;
	public String color;
	public Size size;
	
	public Ball(int id,String color,Size size) 
	{
		this.id = id;
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "\nId : "+this.id+" | Color : "+this.color+" | Size : "+size;
	}
}