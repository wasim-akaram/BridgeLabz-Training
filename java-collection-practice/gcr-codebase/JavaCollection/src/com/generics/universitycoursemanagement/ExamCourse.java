package com.generics.universitycoursemanagement;

public class ExamCourse extends CourseType{

	public ExamCourse(String name, int duration) {
		super(name, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void details() {
		System.out.println("\n-----Exam Course details-----");
		System.out.println("Course Name : "+this.getName());
		System.out.println("Duration    : "+this.getDouration());
		System.out.println("Speciality  : Important Question for Exam");
	}

}