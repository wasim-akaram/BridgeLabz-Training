package com.objectmodeling.levelone;


import java.util.List;
import java.util.ArrayList;
class Hospital 
{
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    Hospital(String hospitalName) 
    {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor)
    {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) 
    {
        patients.add(patient);
    }

    void displayHospitalInfo() 
    {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors available: " + doctors.size());
        System.out.println("Patients registered: " + patients.size());
    }
}
