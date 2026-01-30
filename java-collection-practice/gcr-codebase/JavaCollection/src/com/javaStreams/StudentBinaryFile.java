package com.javaStreams;
import java.io.*;

public class StudentBinaryFile {

    private static final String FILE_NAME = "student.dat";

    public static void main(String[] args) {

       
        int rollNumber = 1;
        String name = "Wasim";
        double gpa = 8.75;

     
        writeStudentData(rollNumber, name, gpa);

    
        readStudentData();
    }

    private static void writeStudentData(int roll, String name, double gpa) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {

            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }

  
    private static void readStudentData() {

        try (DataInputStream dis =  new DataInputStream(new FileInputStream(FILE_NAME))) 
        {

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

       
            System.out.println("Roll Number : " + roll);
            System.out.println("Name        : " + name);
            System.out.println("GPA         : " + gpa);

        } catch (IOException e) 
        {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
