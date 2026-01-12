package com.traincompanion;

public class CompartmentLinkedList 
{
	
	private CompartmentNode head;
	private CompartmentNode tail;
	
	
	//method to add the compartments
	
	public void addCompartment(int compartmentNumber, String name, String feature)
	{
		CompartmentNode newNode = new CompartmentNode(compartmentNumber, name, feature);
		
		if(head == null)
		{
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
	}
	
	
	//method to iterate forward
	public void iterateForward() 
	{
        CompartmentNode temp = head;
        System.out.println("Going forward");
        
        System.out.print("Compartment Number 	 Name        feature  ");

        while (temp != null) 
        {
            System.out.println("\n"+temp.compartmentNumber + "	        " + temp.name +"     " + temp.feature);
            temp = temp.next;
        }
        System.out.println();
    }

	
	//method to iterate backward
	
	public void iterateBackword() 
	{
        CompartmentNode temp = tail;
        System.out.println("Going backward");
        
        System.out.print("Compartment Number 	 Name        feature ");

        while (temp != null) 
        {
            System.out.print( "\n"+temp.compartmentNumber + "	              " + temp.name +"     " + temp.feature);
            temp = temp.prev;
        }
        System.out.println();
    }

	
	

}
