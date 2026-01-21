package com.generics.mealplanner;

import java.util.ArrayList;

public class Meal <T extends MealPlan>{
   ArrayList<T> arr = new ArrayList<>();
   
   public void addMeal(T meal) {
	   if(arr.contains(meal)) {
		   System.out.println("The meal already exists");
	   }
	   arr.add(meal);
   }
   public void detail() {
	   arr.stream().forEach(x->x.display());
   }
}