package com.encapsulation.hospitalpatientmanagement;

public class OutPatient extends Patient 
{

    private static final double CONSULTATION_FEE = 500;

    public OutPatient(int id, String name, int age) 
    {
        super(id, name, age);
    }

    @Override
    public double calculateBill()
    {
        return CONSULTATION_FEE;
    }
}
