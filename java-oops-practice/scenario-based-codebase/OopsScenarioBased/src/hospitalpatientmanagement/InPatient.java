package hospitalpatientmanagement;

class InPatient extends Patient 
{
    private int roomNumber;

    public InPatient(String name, int age, String medicalHistory, int roomNumber)
    {
        super(name, age, medicalHistory);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Room Number: " + roomNumber);
    }
}
