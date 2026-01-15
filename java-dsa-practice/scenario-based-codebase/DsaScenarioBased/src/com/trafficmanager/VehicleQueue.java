package com.trafficmanager;

public class VehicleQueue
{
    private VehicleNode[] queue;
    private int front;
    private int rear;
    private int capacity;

    // constructor
    public VehicleQueue(int capacity)
    {
        this.capacity = capacity;
        queue = new VehicleNode[capacity];
        front = 0;
        rear = -1;
    }

    // enqueue
    public void enqueue(VehicleNode node)
    {
        if (rear == capacity - 1)
        {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = node;
        System.out.println("Vehicle waiting: " + node.vehicleNumber);
    }

    // dequeue
    public VehicleNode dequeue()
    {
        if (front > rear)
        {
            System.out.println("Queue Underflow");
            return null;
        }

        return queue[front++];
    }

    public boolean isEmpty()
    {
        return front > rear;
    }
}
