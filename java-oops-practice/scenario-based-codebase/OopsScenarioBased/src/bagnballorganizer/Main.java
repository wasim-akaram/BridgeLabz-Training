package bagnballorganizer;

public class Main 
{
    public static void main(String[] args) 
    {
    	Bag bag = new Bag(101,"Blue",3);
    	bag.add(0,"Red",Size.Small);
        bag.add(1, "Yellow",Size.Large);
        bag.add(2, "Violet",Size.Medim);
        bag.detail();
    }
}