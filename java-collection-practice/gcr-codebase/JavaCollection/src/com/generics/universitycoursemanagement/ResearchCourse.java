package com.generics.universitycoursemanagement;

public class ResearchCourse  extends CourseType{

	public ResearchCourse(String name, int duration)
	{
		super(name, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void details() {
		System.out.println("\n-----Research Course details-----");
		System.out.println("Course Name : "+this.getName());
		System.out.println("Duration    : "+this.getDouration());
		System.out.println("Speciality  : Research On Industry technology");
	}
    
}