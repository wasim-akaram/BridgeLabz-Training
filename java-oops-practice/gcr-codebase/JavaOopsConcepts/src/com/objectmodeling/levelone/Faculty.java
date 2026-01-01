package com.objectmodeling.levelone;

class Faculty 
{
    private int facultyId;
    private String name;
    private String subject;

    Faculty(int facultyId, String name, String subject) 
    {
        this.facultyId = facultyId;
        this.name = name;
        this.subject = subject;
    }

    void display() 
    {
        System.out.println("Faculty ID: " + facultyId +
                           ", Name: " + name +
                           ", Subject: " + subject);
    }
}
