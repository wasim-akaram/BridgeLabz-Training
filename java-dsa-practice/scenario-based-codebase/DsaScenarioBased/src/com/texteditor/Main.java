package com.texteditor;

public class Main 
{
	public static void main(String args[])
	{
		UndoRedoStack obj = new UndoRedoStack();
		
		obj.addText("Alex");
		obj.addText("Marty");
		obj.addText("Julien");
		obj.addText("Mort");
		obj.addText("Skipper");
		obj.addText("Private");
		obj.addText("Kowalski");
		obj.addText("Rico");
		
	obj.display();
		
		
		
		obj.undo();
		obj.undo();
		
		System.out.println("\nThe stack after undo 2 times\n");
		obj.display();
		
		obj.redo();
		
		System.out.println("\nThe stack after redo 1 time\n");
		obj.display();
		
		
	}

}
