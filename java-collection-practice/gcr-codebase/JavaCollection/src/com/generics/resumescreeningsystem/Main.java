package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        Resume<SoftwareEngineer> seResume =
                new Resume<>(new SoftwareEngineer("Lucky", 3, 85));

        Resume<DataScientist> dsResume =
                new Resume<>(new DataScientist("Nageshwar", 1, 78));

        Resume<ProductManager> pmResume =
                new Resume<>(new ProductManager("Himesh", 2, 75));

        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        List<SoftwareEngineer> engineers = new ArrayList<>();
        engineers.add(new SoftwareEngineer("Lucky", 4, 90));

        ScreeningPipeline.screenAll(engineers);
    }
}