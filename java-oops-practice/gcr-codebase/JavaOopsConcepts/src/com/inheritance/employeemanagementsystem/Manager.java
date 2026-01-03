package com.inheritance.employeemanagementsystem;

class Manager extends Employee 
{

    int teamSize;

    Manager(String name, String empId, double salary, int teamSize) 
    {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }

   
   public void showDetails() 
    {
        super.showDetails();
        System.out.println("Team Size : " + teamSize);
        
    }
}
