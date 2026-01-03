package com.inheritance.employeemanagementsystem;

public class Employee 
{
	String name;
	String empId;
	double salary;
	
	public Employee(String name, String empId, double salary)
	{
		this.name = name;
		this.empId = empId;
		this.salary= salary;
	}
	
	public void showDetails()
	{
		System.out.println("\nName   : " + name);
        System.out.println("ID     : " + empId);
        System.out.println("Salary : " + salary);
        
	}

}
