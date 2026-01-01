package com.objectmodeling.levelone;

public class MainOfUniversity 
{
    public static void main(String[] args) 
    {

        // Faculty exist independently
        Faculty f1 = new Faculty(1, "Dr. BC Patel", "Data Science");
        Faculty f2 = new Faculty(2, "Dr. Abhishek Purohit", "Artificial Intelligence");

        University university = new University("Bhopal Technological University");

        university.addDepartment("Data Science");
        university.addDepartment("Artificial Intelligence");

        university.addFaculty(f1);
        university.addFaculty(f2);

        university.displayUniversity();

        // Delete University
        university.deleteUniversity();

        // Faculty still exists independently
        System.out.println("\nFaculty still exists independently:");
        f1.display();
        f2.display();
    }
}
