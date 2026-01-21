package com.generics.resumescreeningsystem;

public class DataScientist extends JobRole {
    int mlScore;

    public DataScientist(String name, int experience, int mlScore) {
        super(name, experience);
        this.mlScore = mlScore;
    }

    @Override
    boolean isEligible() {
        return experience >= 1 && mlScore >= 75;
    }
}