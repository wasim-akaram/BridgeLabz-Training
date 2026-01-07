package petpal;




import java.util.Random;

public abstract class Pet implements IInteractable 
{

    protected String name;
    protected String type;
    protected int age;

    
    private int hunger; 
    private int energy; 
    private int mood;  
   
    public Pet(String name, String type, int age) 
    {
        this.name = name;
        this.type = type;
        this.age = age;

        Random random = new Random();
        this.hunger = random.nextInt(41) + 30; 
        this.energy = random.nextInt(41) + 30;
        this.mood = random.nextInt(41) + 30;
    }

    // User-specified constructor
    public Pet(String name, String type, int age,
               int hunger, int energy, int mood) 
    {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    
    


    public int getHunger() 
    {
        return hunger;
    }

    public int getEnergy() 
    {
        return energy;
    }

    public int getMood() 
    {
        return mood;
    }

    
    public void feed() 
    {
        hunger -= 20;
        mood += 10;
        if (hunger < 0) hunger = 0;
        if (mood > 100) mood = 100;
    }

    @Override
    public void play() 
    {
        energy -= 15;
        hunger += 10;
        mood += 20;
        normalize();
    }

    @Override
    public void sleep()
    {
        energy += 30;
        hunger += 10;
        normalize();
    }

    // Internal helper → NOT exposed
    private void normalize() 
    {
        if (energy > 100) energy = 100;
        if (energy < 0) energy = 0;
        if (hunger > 100) hunger = 100;
        if (mood > 100) mood = 100;
    }

    
    public abstract void makeSound();
}
