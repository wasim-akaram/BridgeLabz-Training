package fittrack;



public abstract class Workout implements ITrackable 
{

    protected String type;
    protected int duration; 

    protected int caloriesBurned;

    
    protected void logWorkout() 
    {
        System.out.println("Workout logged internally.");
    }

    public Workout(String type, int duration)
    {
        this.type = type;
        this.duration = duration;
    }



    public abstract int calculateCalories();

    public int getCaloriesBurned() 
    {
        return caloriesBurned;
    }



    public void beginWorkout() 
    {
        System.out.println(type + " workout started.");
    }

    @Override    public void endWorkout() 
    {
        caloriesBurned = calculateCalories();
        logWorkout();
        System.out.println(type + " workout stopped.");
    }
}
