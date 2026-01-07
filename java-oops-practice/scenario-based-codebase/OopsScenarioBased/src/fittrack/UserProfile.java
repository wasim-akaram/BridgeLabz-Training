package fittrack;

public class UserProfile 
{

    private String name;
    private int age;

    
    private double weight;

    private int dailyCalorieTarget;



    public UserProfile(String name, int age, double weight) 
    {
        this(name, age, weight, 2000); 

    }

    
    public UserProfile(String name, int age, double weight, int dailyCalorieTarget) 
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieTarget = dailyCalorieTarget;
    }

    
    public double getWeight() 
    {
        return weight;
    }

    public int getDailyCalorieTarget() 
    {
        return dailyCalorieTarget;
    }

    
    public int calculateRemainingCalories(int caloriesBurned)
    {
        return dailyCalorieTarget - caloriesBurned;
    }
}
