package hospitalpatientmanagement;

public class Patient 
{
	private String name;
    private int age;
    private String medicalHistory;

    public Patient(String name, int age) 
    {
        this.name = name;
        this.age = age;
        this.medicalHistory = "New patient";
    }

    public Patient(String name, int age, String medicalHistory) 
    {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() 
    {
        return "Patient Name: " + name + ", Age: " + age + ", Medical History: " + medicalHistory;
    }

    public void displayInfo() 
    {
        System.out.println(getSummary());
    }

}
