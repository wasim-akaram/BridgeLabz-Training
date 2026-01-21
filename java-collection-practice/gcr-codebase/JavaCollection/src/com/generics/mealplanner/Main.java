package com.generics.mealplanner;

public class Main {
	public static void main(String[] args) {
		Meal<MealPlan> meal = new Meal();
		meal.addMeal(new NonVeg("veg salad",150,15));
		meal.addMeal(new VegMeal("Paneer",350,20));
		meal.detail();
	}
}