package com.linkedlist.undoredo;



class TextHistory 
{
	

    private TextState head;
    private TextState tail;
    private TextState current;

    private int size = 0;
    private final int MAX_HISTORY = 10;

    // 1. Add new text state
    public void addState(String content) 
    {

        TextState newState = new TextState(content);

        // If undo was used, remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            trimSizeFrom(current.next);
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Enforce history limit
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // 2. Undo operation
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }

        current = current.prev;
        System.out.println("Undo performed");
    }

    // 3. Redo operation
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }

        current = current.next;
        System.out.println("Redo performed");
    }

    // 4. Display current state
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
            return;
        }

        System.out.println("Current Text: " + current.content);
    }

    // Helper to clean abandoned redo states (safety)
    private void trimSizeFrom(TextState node) {
        while (node != null) {
            size--;
            node = node.next;
        }
    }
}
