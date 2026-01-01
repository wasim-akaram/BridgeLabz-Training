package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Department 
{
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) 
    {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Create employees inside department
    public void addEmployee(int id, String name) 
    {
        employees.add(new Employee(id, name));
    }

    public void displayDepartment()
    {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees)
        {
            emp.displayEmployee();
        }
    }

}
