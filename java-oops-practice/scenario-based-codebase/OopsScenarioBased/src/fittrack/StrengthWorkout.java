package fittrack;



public  class StrengthWorkout extends Workout 
{

    public StrengthWorkout(int duration) 
    {
        super("Strength", duration);
    }

    @Override
    public int calculateCalories() 
    {
        return duration * 6; 
    }
}
