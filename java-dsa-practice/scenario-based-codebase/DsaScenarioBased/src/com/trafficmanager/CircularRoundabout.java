package com.trafficmanager;

public class CircularRoundabout
{
    private VehicleNode head = null;

    // add vehicle in circular path
    public void addVehicle(VehicleNode node)
    {
        if (head == null)
        {
            head = node;
            node.next = head;
        }
        else
        {
            VehicleNode temp = head;
            while (temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }

        System.out.println("Vehicle entered: " + node.vehicleNumber);
    }

    // remove vehicle from circular path
    public void removeVehicle(int vehicleId)
    {
        if (head == null)
        {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode curr = head;
        VehicleNode prev = null;

        do
        {
            if (curr.vehicleId == vehicleId)
            {
                if (curr == head && curr.next == head)
                {
                    head = null;
                }
                else if (curr == head)
                {
                    VehicleNode last = head;
                    while (last.next != head)
                    {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                else
                {
                    prev.next = curr.next;
                }

                System.out.println("Vehicle exited: " + curr.vehicleNumber);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    // print roundabout
    public void printRoundabout()
    {
        if (head == null)
        {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode temp = head;
        System.out.print("Roundabout: ");
        do
        {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}
