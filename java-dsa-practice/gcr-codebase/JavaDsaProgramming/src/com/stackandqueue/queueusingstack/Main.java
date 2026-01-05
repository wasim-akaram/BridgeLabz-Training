package com.stackandqueue.queueusingstack;


public class Main
{

    public static void main(String[] args) 
    {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(56);
        queue.enqueue(26);
        queue.enqueue(98);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}