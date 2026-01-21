package com.generics.mealplanner;

public abstract class MealPlan {
	  private String type; 
      private String name;
      private int calories;
      private double protein;
      
      public MealPlan(String name, int calories, double protein,String type) {
    	  this.name = name;
    	  this.calories = calories;
    	  this.protein = protein;
    	  this.type = type;
      }
      
      public String getType() {
		return type;
	}

	  public void setType(String type) {
		  this.type = type;
	  }

	  public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }

	  public int getCalories() {
		  return calories;
	  }

	  public void setCalories(int calories) {
		  this.calories = calories;
	  }

	  public double getProtein() {
		  return protein;
	  }

	  public void setProtein(double protein) {
		  this.protein = protein;
	  }

	  public abstract void display();
}