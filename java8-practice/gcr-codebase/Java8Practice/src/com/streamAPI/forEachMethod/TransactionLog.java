package com.streamAPI.forEachMethod;



import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TransactionLog 
{
	public static void main(String args[])
	{
	List <String> transactionID = Arrays.asList("T01", "T02", "T03", "T05", "T06", "T08");
	
	transactionID.stream()
				.forEach(transaction -> System.out.println(LocalDateTime.now() + " -Transaction: " + transaction));
	}
}
