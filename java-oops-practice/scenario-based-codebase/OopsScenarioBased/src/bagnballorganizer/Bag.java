package bagnballorganizer;

import java.util.ArrayList;

public class Bag {
     public int id;
     public String color;
     public int capacity;
     ArrayList<Ball> balls = new ArrayList<>();
     
     public Bag(int id,String color,int capacity) {
    	 this.id = id;
    	 this.color = color;
    	 this.capacity = capacity;
     }
     
     public void add(int id, String color,Size size) {
    	 if(capacity<=0) {
    		 System.out.println("Capacity exceed");
    		 return;
    	 }
    	 for(Ball b: balls) {
    		 if(b.id ==id) {
    			 System.out.println("The Id already exists"); 
    			 return;
    		 }
    	 }
    	 balls.add(new Ball(id,color,size));
    	 this.capacity -=1;
     }
     
     public void remove(int id) {
    	 if(balls==null) {
    		 System.out.println("The List is empty");
    		 return;
    	 }
    	 for(Ball b: balls) {
    		 if(b.id ==id) {
    			 System.out.println("Remove ball "+b.id);
    			 this.capacity +=1;
    			 balls.remove(b);
    			 return;
    		 }
    	 }
    	 System.out.println("The Id does not exists");
     }
     
     public void detail() {
    	 System.out.println("\n------Bag Details-----");
         System.out.println("Bag Id                 : "+this.id);
         System.out.println("Bag Color              : "+this.color);
         System.out.println("Bag capacity remaining : "+this.capacity);
         System.out.println("\n------Ball Detail-----");
         for(Ball b: balls) {
        	 System.out.println(b.toString());
         }
     }
}