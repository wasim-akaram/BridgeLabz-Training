package com.generics.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    int codingScore;

    public SoftwareEngineer(String name, int experience, int codingScore) {
        super(name, experience);
        this.codingScore = codingScore;
    }

    @Override
    boolean isEligible() {
        return experience >= 2 && codingScore >= 70;
    }
}