package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args) 
    {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "King Julien", 25, 5);
        Patient p2 = new OutPatient(102, "Mort", 30);

        p1.addRecord("Admitted for surgery");
        p1.addRecord("Post-operative care");
        p2.addRecord("General consultation");

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) 
        {
            
            patient.getPatientDetails();
            patient.viewRecords();
            System.out.println("Total Bill: " + patient.calculateBill());
        }
    }
}
