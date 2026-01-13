package com.texteditor;

import java.util.Iterator;
import java.util.Stack;

public class UndoRedoStack 
{

	Stack<String> operation = new Stack<>();
	Stack<String> afterUndo = new Stack<>();

	public Stack<String> addText(String str) 
	{
		operation.push(str);
		return operation;
	}

	// method to perform undo and add string into another stack

	public Stack<String> undo() 
	{
		String str = operation.pop();
		
		
		afterUndo.push(str);
		return operation;
	}

	// method to perform redo operation
	public Stack<String> redo() 
	{
		String str = afterUndo.pop();
		
		operation.push(str);
		return operation;
	}


	// method to display all the elements of stack
	public void display() 
	{
	
        for (String element : operation) 
        {
            System.out.print(element + " ");
        }
	}
}
