package com.generics.resumescreeningsystem;

public class Resume<T extends JobRole> {
    private T candidate;

    public Resume(T candidate) {
        this.candidate = candidate;
    }

    public void processResume() {
        System.out.println("Processing resume of: " + candidate.candidateName);

        if (candidate.isEligible()) {
            System.out.println(" Shortlisted ");
        } else {
            System.out.println(" Rejected ");
        }
    }
}