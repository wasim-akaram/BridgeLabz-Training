package com.inheritance.schoolsystem;

public class Main 
{

	public static void main(String[] args) 
	{
		Teacher teacher = new Teacher("Julien", 38, "Well Being");
        Student student = new Student("Mort", 22, "A+");
        Staff staff = new Staff("Alex", 40, "Management Department");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
	}

}