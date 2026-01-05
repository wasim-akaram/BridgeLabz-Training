package com.stackandqueue.queueusingstack;


import java.util.Stack;

class QueueUsingStacks 
{

    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    // Enqueue operation
    public void enqueue(int data) 
    {
        inStack.push(data);
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty");
            return -1;
        }

        if (outStack.isEmpty()) 
        {
            while (!inStack.isEmpty()) 
            {
                outStack.push(inStack.pop());
            }
        }

        return outStack.pop();
    }

    // Peek operation
    public int peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty");
            return -1;
        }

        if (outStack.isEmpty()) 
        {
            while (!inStack.isEmpty()) 
            {
                outStack.push(inStack.pop());
            }
        }

        return outStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() 
    {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
