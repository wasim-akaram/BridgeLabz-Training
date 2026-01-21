package com.generics.resumescreeningsystem;

import java.util.List;

public class ScreeningPipeline {

    public static void screenAll(List<? extends JobRole> candidates) {
        for (JobRole role : candidates) {
            System.out.println("Screening: " + role.candidateName);

            if (role.isEligible()) {
                System.out.println(" Passed Screening\n");
            } else {
                System.out.println(" Failed Screening\n");
            }
        }
    }
}
