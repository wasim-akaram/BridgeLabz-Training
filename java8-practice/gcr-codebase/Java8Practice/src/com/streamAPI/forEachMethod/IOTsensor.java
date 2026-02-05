package com.streamAPI.forEachMethod;

import java.util.Arrays;
import java.util.List;

public class IOTsensor 
{
	public static void  main(String [] args)
	{
		List<Double> sensorReading = Arrays.asList(45.7, 78.6, 55.7,68.0,76.0,54.9,55.1,60.8);
		
		Double thresold = 55.0;
		
		sensorReading.stream()
		.filter(reading -> reading > thresold)
		.forEach(reading ->System.out.println("Warning! Reading reached " + reading));
		}
	}



