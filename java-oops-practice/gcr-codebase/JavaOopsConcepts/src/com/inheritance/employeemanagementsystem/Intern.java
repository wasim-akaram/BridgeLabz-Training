package com.inheritance.employeemanagementsystem;

class Intern extends Employee
{

    int duration;

    Intern(String name, String empId, double salary, int durationInMonths) 
    {
        super(name, empId, salary);
        this.duration = durationInMonths;
    }


    public void showDetails() 
    {
        super.showDetails();
        System.out.println("Internship Duration : " + duration + " months");
        
    }
}
