package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements MedicalRecord 

{

    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data 
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) 
    {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }

    // Encapsulation: controlled access
    protected void setDiagnosis(String diagnosis) 
    {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() 
    {
        return diagnosis;
    }

    @Override
    public void addRecord(String record) 
    {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() 
    {
        System.out.println("\nMedical Records:");
        for (String record : medicalHistory) 
        {
            System.out.println("- " + record);
        }
    }
}
