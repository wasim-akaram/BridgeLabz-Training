package com.objectmodeling.levelone;

class DepartmentD 
{
    private String departmentName;

    DepartmentD(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    void display() 
    {
        System.out.println("Department: " + departmentName);
    }
}
