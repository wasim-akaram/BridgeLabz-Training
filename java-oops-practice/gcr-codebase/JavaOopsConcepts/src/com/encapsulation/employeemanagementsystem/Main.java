package com.encapsulation.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main 
{

    public static void main(String[] args) 
    {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Wasim", 50000);
        emp1.assignDepartment("IT");

        Employee emp2 = new PartTimeEmployee(102, "Ayaan", 80, 300);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        // Polymorphism: Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
