package com.generics.universitycoursemanagement;

public abstract class CourseType {
      private String name;
      private int douration; // in months
      
      public CourseType(String name,int duration) {
    	  this.name = name;
    	  this.douration = duration;
      }
      
      public String getName() {
		return name;
	}

	  public void setName(String name) {
		  this.name = name;
	  }

	  public int getDouration() {
		  return douration;
	  }

	  public void setDouration(int douration) {
		  this.douration = douration;
	  }

	  public abstract void details();
}