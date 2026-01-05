package com.stackandqueue.sortstack;

import java.util.Stack;

class SortStackUsingRecursion 
{

    // Sort the entire stack
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) 
        {
            return;
        }

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    // Insert element into sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) 
    {
        if (stack.isEmpty() || stack.peek() <= element) 
        {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }
}
