package fittrack;



public class Main
{

    public static void main(String[] args) 
    {

        UserProfile user = new UserProfile("Wasim", 22, 68.5,2500);

        // Polymorphism
        Workout workout1 = new CardioWorkout(30);
        Workout workout2 = new StrengthWorkout(40);

        workout1.beginWorkout();
        workout1.endWorkout();

        workout2.beginWorkout();
        workout2.endWorkout();

        int totalCaloriesBurned =
                workout1.getCaloriesBurned() +
                workout2.getCaloriesBurned(); 

        int remaining =
                user.calculateRemainingCalories(totalCaloriesBurned);

        System.out.println("Total Calories Burned today: " + totalCaloriesBurned);
        System.out.println("Remaining Calories: " + remaining);
    }
}
