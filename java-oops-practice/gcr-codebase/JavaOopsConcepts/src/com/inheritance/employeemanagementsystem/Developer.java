package com.inheritance.employeemanagementsystem;

class Developer extends Employee 
{

    String programmingLanguage;

    Developer(String name, String empId, double salary, String programmingLanguage) 
    {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

   
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Language : " + programmingLanguage);
        
    }
}

