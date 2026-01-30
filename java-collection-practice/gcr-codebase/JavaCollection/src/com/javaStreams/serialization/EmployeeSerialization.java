package com.javaStreams.serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization 
{

    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) 
    {

        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alex", "IT", 55000));
        employees.add(new Employee(102, "Skipper", "HR", 48000));
        employees.add(new Employee(103, "Rico", "Finance", 60000));

        
        serializeEmployees(employees);

        
        deserializeEmployees();
    }

    // Writing objects to file
    private static void serializeEmployees(List<Employee> employees) 
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        }
        catch (IOException e) 
        {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }

    // Read objects from file
    private static void deserializeEmployees() 
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {

            List<Employee> employees = (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Data:");
            for (Employee emp : employees) 
            {
                System.out.println(emp);
            }

        } catch (IOException e)
        {
            System.out.println("IO error: " + e.getMessage());
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
