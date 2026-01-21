package com.generics.mealplanner;

public class NonVeg extends MealPlan 
{

	public NonVeg(String name, int calories, double protein) 
	{
		super(name, calories, protein,"Vegan");
		
	}

	@Override
	public void display() {
		    System.out.println("\n-----non VegMeal--------");
		    System.out.println("Meal Name : "+this.getName());
		    System.out.println("Calories  : "+this.getCalories());
		    System.out.println("Protein   : "+this.getProtein());
		    System.out.println("Type      : "+this.getType());
	}

}