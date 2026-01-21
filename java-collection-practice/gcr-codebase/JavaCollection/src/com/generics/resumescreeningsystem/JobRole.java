package com.generics.resumescreeningsystem;

public abstract class JobRole {
    String candidateName;
    int experience; 

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

   
    abstract boolean isEligible();
}