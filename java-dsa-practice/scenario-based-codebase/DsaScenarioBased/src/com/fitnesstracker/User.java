package com.fitnesstracker;

public class User 
{
      public int id;
      public long steps;
	 
      public User(int id, long steps) 
      {
		this.id = id;
		this.steps = steps;
	  }
      
      @Override
    public String toString() 
      {
    	
    	return "\nUser Id : "+this.id+" | Steps : "+this.steps;
    }
}