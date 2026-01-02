package hospitalpatientmanagement;


import java.util.ArrayList;
import java.util.List;
public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("ABC", 45, "fever", 101));
        patients.add(new OutPatient("DEF", 30, "FOOD POISIONING", "2024-07-15"));

        Doctor doctor = new Doctor("Dr. Neffario", "Cardiology");
        doctor.displayInfo();

        for (Patient patient : patients) {
            patient.displayInfo();
            Bill bill = new Bill(10500.0, 0.05, 250.0);
            System.out.println("Total Payment: $" + bill.calculatePayment());
           
        }
    }
}
