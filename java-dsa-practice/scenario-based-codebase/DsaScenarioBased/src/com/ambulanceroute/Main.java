package com.ambulanceroute;



public class Main {
	
	 public static void main(String[] args) {

	        AmbulanceRouteLinkedList route = new AmbulanceRouteLinkedList();

	        route.addUnit("Emergency", false);
	        route.addUnit("Radiology", false);
	        route.addUnit("Surgery", false);
	        route.addUnit("ICU", true);

	        route.findAvailableUnit();

	        System.out.println("\nSurgery under maintenance");
	        route.removeUnit("Surgery");

	        route.findAvailableUnit();
	    }

}
