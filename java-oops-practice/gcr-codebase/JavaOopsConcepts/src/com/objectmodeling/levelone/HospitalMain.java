package com.objectmodeling.levelone;

public class HospitalMain 
{
    public static void main(String[] args) 
    {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor(101, "Dr. Imran", "Pediatrics");
        Doctor d2 = new Doctor(102, "Dr. Vishal", "Radiology");

        Patient p1 = new Patient(1, "Wasim");
        Patient p2 = new Patient(2, "Alex");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.displayHospitalInfo();
        System.out.println();

        // Consultations (Communication)
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);

        System.out.println();
        d1.showPatients();
        System.out.println();
        d2.showPatients();
    }
}
