package hospitalpatientmanagement;

class OutPatient extends Patient 
{
    private String appointmentDate;

    public OutPatient(String name, int age, String medicalHistory, String appointmentDate) 
    {
        super(name, age, medicalHistory);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Appointment Date: " + appointmentDate);
    }
}
