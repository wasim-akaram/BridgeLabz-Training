package com.generics.universitycoursemanagement;

import java.util.ArrayList;

public class Course <T extends CourseType>
{
    ArrayList<T> arr = new ArrayList<>();
    
    public void addCourse(T course) 
    {
    	if(arr.contains(course)) 
    	{
    		System.out.println("The course is already persent");
    		return;
    	}
    	arr.add(course);
    }
   public void view() 
   {
	   // for using wild card generic method 
	   Display.display(arr);
   }
}