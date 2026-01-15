package com.trafficmanager;

public class Main
{
    public static void main(String[] args)
    {
        CircularRoundabout roundabout = new CircularRoundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);

        VehicleNode v1 = new VehicleNode(1, "KA01-AA-1234");
        VehicleNode v2 = new VehicleNode(2, "KA02-BB-5678");
        VehicleNode v3 = new VehicleNode(3, "KA03-CC-9999");
        VehicleNode v4 = new VehicleNode(4, "KA04-DD-1111");

        waitingQueue.enqueue(v1);
        waitingQueue.enqueue(v2);
        waitingQueue.enqueue(v3);
        waitingQueue.enqueue(v4); // overflow

        roundabout.addVehicle(waitingQueue.dequeue());
        roundabout.addVehicle(waitingQueue.dequeue());

        roundabout.printRoundabout();

        roundabout.removeVehicle(1);
        roundabout.printRoundabout();
    }
}
