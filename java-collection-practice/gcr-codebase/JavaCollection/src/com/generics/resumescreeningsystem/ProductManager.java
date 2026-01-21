package com.generics.resumescreeningsystem;

public class ProductManager extends JobRole {
    int communicationScore;

    public ProductManager(String name, int experience, int communicationScore) {
        super(name, experience);
        this.communicationScore = communicationScore;
    }

    @Override
    boolean isEligible() {
        return experience >= 3 && communicationScore >= 80;
    }
}