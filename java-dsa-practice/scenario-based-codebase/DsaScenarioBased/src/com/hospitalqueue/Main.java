package com.hospitalqueue;

import java.util.ArrayList;

public class Main 
{
	 public static void main(String [] args) 
	 {
		 Patient p = new Patient("Alex", 25, 9);
		 Patient q = new Patient("Marty", 26, 5);
		 Patient r = new Patient("Julien", 31, 6);
		 Patient s = new Patient("Skipper", 16, 1);
		 Patient t = new Patient("Kowalski", 14, 2);
		 Patient u = new Patient("Private", 7, 3);
		 Patient v = new Patient("Rico", 13, 4);
		 Patient w = new Patient("Mort", 6, 3);
		 Patient x = new Patient("Melmen", 57, 10);
		 
		 ArrayList <Patient > patientlist = new ArrayList<>();
		 
		 patientlist.add(p);
		 patientlist.add(q);
		 patientlist.add(r);
		 patientlist.add(s);
		 patientlist.add(t);
		 patientlist.add(u);
		 patientlist.add(v);
		 patientlist.add(w);
		 patientlist.add(x);
		 
		 System.out.println("Patient list before sorting");
		 x.display(patientlist);
		 
		 x.bubbleSort(patientlist);
		 System.out.println("Patient list after sorting");
		 x.display(patientlist);
		 
		
	 }
}
