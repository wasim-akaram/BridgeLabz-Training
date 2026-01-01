package com.objectmodeling.levelone;

public class Composition 
{
    public static void main(String[] args) 
    {

        Company company = new Company("Purple Tech");

        Department devDept = company.addDepartment("Photography");
        devDept.addEmployee(101, "Wasim");
        devDept.addEmployee(102, "Zishan");

        Department hrDept = company.addDepartment("HR");
        hrDept.addEmployee(201, "Gufran");

        company.displayCompany();

        
    }
}

