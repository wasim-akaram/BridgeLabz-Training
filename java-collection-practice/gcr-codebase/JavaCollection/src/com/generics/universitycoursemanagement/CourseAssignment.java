package com.generics.universitycoursemanagement;

public class CourseAssignment extends CourseType
{

	public CourseAssignment(String name, int duration) 
	{
		super(name, duration);
	
	}

	@Override
	public void details() 
	{
		System.out.println("\n-----Assignment Course details-----");
		System.out.println("Course Name : "+this.getName());
		System.out.println("Duration    : "+this.getDouration());
		System.out.println("Speciality  : Important For Knowledge");
	}

}