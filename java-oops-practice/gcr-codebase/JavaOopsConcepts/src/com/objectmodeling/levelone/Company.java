package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Company 
{
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) 
    {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Create department inside company
    public Department addDepartment(String deptName) 
    {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

	    public void displayCompany() 
	    {
	        System.out.println("Company: " + companyName);
	        for (Department dept : departments) {
	            dept.displayDepartment();
	            System.out.println();
	    }
    }

}
