package com.encapsulation.hospitalpatientmanagement;

public class InPatient extends Patient 
{

    private int daysAdmitted;
    private static final double DAILY_CHARGE = 3000;

    public InPatient(int id, String name, int age, int daysAdmitted) 
    {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() 
    {
        return daysAdmitted * DAILY_CHARGE;
    }
}
