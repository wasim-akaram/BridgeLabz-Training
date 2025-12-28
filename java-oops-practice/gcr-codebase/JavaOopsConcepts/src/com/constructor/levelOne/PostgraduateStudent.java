package com.constructor.levelOne;

public class PostgraduateStudent extends Student
{
	public PostgraduateStudent(int rollNumber, String name, double CGPA)
	{
		super (rollNumber, name, CGPA);
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Roll number : "+ rollNumber);
		System.out.println("Name " + name);
		System.out.println("CGPA " + getCGPA());
	}

}
