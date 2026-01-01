package com.objectmodeling.levelone;


import java.util.List;
import java.util.ArrayList;

class Doctor 
{
    private int doctorId;
    private String name;
    private String specialization;
    private List<Patient> patients;

    Doctor(int doctorId, String name, String specialization) 
    {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Association and Communication
    void consult(Patient patient) 
    {
        patients.add(patient);
        System.out.println(
            "Doctor " + name +
            " is consulting patient " + patient.getName()
        );
    }

    void showPatients() 
    {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients)
        {
            System.out.println("Patient: " + p.getName());
        }
    }
}
