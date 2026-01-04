package com.linkedlist.roundrobinalgorithm;



public class Main
{

    public static void main(String[] args) 
    {

        int timeQuantum = 4;
        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.executeScheduling();
    }
}

