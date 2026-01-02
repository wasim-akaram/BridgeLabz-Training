package hospitalpatientmanagement;

class Doctor
{
    private String name;
    private String specialization;

    public Doctor(String name, String specialization)
    {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo()
    {
        System.out.println("Doctor Name: " + name + ", Specialization: " + specialization);
    }
}