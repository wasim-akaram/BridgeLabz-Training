package com.generics.mealplanner;

public class VegMeal extends MealPlan{

	public VegMeal(String name, int calories, double protein) {
		super(name, calories, protein,"Veg");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
	    System.out.println("\n-----Vegetarian Meal--------");
	    System.out.println("Meal Name : "+this.getName());
	    System.out.println("Calories  : "+this.getCalories());
	    System.out.println("Protein   : "+this.getProtein());
	    System.out.println("Type      : "+this.getType());
	}

}