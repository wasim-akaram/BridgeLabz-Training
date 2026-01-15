package com.hospitalqueue;

import java.util.ArrayList;
import java.util.Collections;

public class Patient 
{
	String name;
	int age;
	int criticality;
	
	public Patient(String name, int age, int criticality)
	{
		this.name = name;
		this.age = age;
		this.criticality = criticality;
		
	}
	
	public Patient() 
	{
		super();
	}

	public void bubbleSort(ArrayList<Patient > patientlist)
	
	{
		Patient p =  new Patient();
		int length = patientlist.size();
		boolean swapped;
		for(int i=0; i<length-1; i++)
		{
			swapped = false;
			for (int j=0; j<length -i-1; j++)
			{
				Patient  a= patientlist.get(j);
			Patient  b = patientlist.get(j+1);
			
			
				if (a.criticality < b.criticality)
				{
					//swapp the patient order
					Collections.swap(patientlist, j, j+1);
					swapped = true;
				}
				
			}
			if (!swapped) break;
			
			
		}
		
		
		
	}
	
	public void display(ArrayList<Patient > patientlist)
	{
		for(Patient p : patientlist) 
		{
			System.out.println(p.name);
		}
	}
	
	
	


	

}
