package fittrack;



public  class CardioWorkout extends Workout 
{

    public CardioWorkout(int duration) 
    {
        super("Cardio", duration);
    }

    @Override
    public int calculateCalories() 
    {
        
        return duration * 8; 
    }
}
		