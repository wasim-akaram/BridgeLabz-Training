package com.workshopJava8Features;
public class AmbulanceService extends TaxiService
        implements EmergencyService {

    @Override
    public String getServiceName() {
        return "Ambulance";
    }
}
