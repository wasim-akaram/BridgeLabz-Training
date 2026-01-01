package com.objectmodeling.levelone;



import java.util.List;
import java.util.ArrayList;

class University
{
    private String universityName;
    private List<DepartmentD> departments;
    private List<Faculty> faculties;

    University(String universityName) 
    {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: University creates DepartmentD
    void addDepartment(String deptName) 
    {
        departments.add(new DepartmentD(deptName));
    }

    // Aggregation: Faculty passed from outside
    void addFaculty(Faculty faculty) 
    {
        faculties.add(faculty);
    }

    void displayUniversity() 
    {
        System.out.println("University: " + universityName);

        System.out.println("\nDepartments:");
        for (DepartmentD d : departments) 
        {
            d.display();
        }

        System.out.println("\nFaculties:");
        for (Faculty f : faculties) 
        {
            f.display();
        }
    }

    // Simulated deletion of University
    void deleteUniversity()
    {
        departments.clear();   // DepartmentD objects destroyed
        System.out.println("\nUniversity closed → All departments closed");
    }
}
