package com.linkedlist.undoredo;



public class Main 
{

    public static void main(String[] args) 
    {

        TextHistory editor = new TextHistory();

        editor.addState("Hello");
        editor.displayCurrentState();

        editor.addState("Hello World");
        editor.displayCurrentState();

        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        
    }
}

