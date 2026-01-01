package com.objectmodeling.levelone;

class Patient {
	
    private int patientId;
    private String name;

    Patient(int patientId, String name) 
    {
        this.patientId = patientId;
        this.name = name;
    }

    String getName() 
    {
        return name;
    }
}
