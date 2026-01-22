package com.foodfest;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	   public static void main(String[] args)
	   {

	       
	        List<Stall> zoneA = List.of(
	                new Stall("Chinese", 120, "Zone A"),
	                new Stall("Mexican", 200, "Zone A")
	        );

	        List<Stall> zoneB = List.of(
	                new Stall("English", 150, "Zone B"),
	                new Stall("Indian", 200, "Zone B")
	        );

	        
	        List<Stall> allStalls = new ArrayList<>();
	        allStalls.addAll(zoneA);
	        allStalls.addAll(zoneB);

	        List<Stall> sortedStalls = mergeSort(allStalls);

	        System.out.println("Master Footfall Report:");
	        for (Stall stall : sortedStalls) {
	            System.out.println(stall);
	        }
	    }
	  public static List<Stall> mergeSort(List<Stall> stalls) {
	        if (stalls.size() <= 1) return stalls;

	        int mid = stalls.size() / 2;

	        List<Stall> left = mergeSort(stalls.subList(0, mid));
	        List<Stall> right = mergeSort(stalls.subList(mid, stalls.size()));

	        return merge(left, right);
	    }

	    private static List<Stall> merge(List<Stall> left, List<Stall> right) {
	        List<Stall> result = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < left.size() && j < right.size()) {
	            if (left.get(i).footfall <= right.get(j).footfall) {
	                result.add(left.get(i++));
	            } else {
	                result.add(right.get(j++));
	            }
	        }

	        while (i < left.size()) result.add(left.get(i++));
	        while (j < right.size()) result.add(right.get(j++));

	        return result;
	    }

	 
}