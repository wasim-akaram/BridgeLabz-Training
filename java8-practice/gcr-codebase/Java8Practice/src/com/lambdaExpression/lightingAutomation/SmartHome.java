package com.lambdaExpression.lightingAutomation;

public class SmartHome 
{
	 public static void main(String[] args) 
	 {
		 
	 
	//motion detected then turn on light
	LightAction motionDetected = () -> System.out.println("Motion detected-----> Activate white light ");
	
	//method for light activation when some sound heard
	LightAction soundHeard = () -> System.out.println("Command herd to switch Blue lights---> Blue light switched on");
	
	
	//method to activate lights according to time of day
	LightAction timeofDay = () -> System.out.println("Its evening ---->turn the light on");
	 
	 
	 // Simulate triggers
    executeLightAction(motionDetected);
    executeLightAction(soundHeard);
    executeLightAction(timeofDay);
	 }
	 


	static void executeLightAction(LightAction action) 
	{
    action.activate();
	}
	
}
