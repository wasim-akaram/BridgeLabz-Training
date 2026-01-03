package com.inheritance.employeemanagementsystem;

public class Main 
{

    public static void main(String[] args) 
    {

        Employee e1 = new Manager("Wasim", "HR1234", 80000, 5);
        Employee e2 = new Developer("Vipin", "IT1324", 60000, "Java");
        Employee e3 = new Intern("Alex", "PR1000",25000, 6);

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}
