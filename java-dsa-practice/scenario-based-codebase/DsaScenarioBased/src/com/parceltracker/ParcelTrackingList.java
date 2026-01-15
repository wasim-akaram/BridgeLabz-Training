package com.parceltracker;

public class ParcelTrackingList
{
    StageNode head;

    // add stage at end
    public void addStage(String stage)
    {
        StageNode node = new StageNode(stage);

        if (head == null)
        {
            head = node;
            return;
        }

        StageNode temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }

    // insert intermediate stage
    public void addAfter(String afterStage, String newStage)
    {
        StageNode temp = head;

        while (temp != null)
        {
            if (temp.stage.equals(afterStage))
            {
                StageNode node = new StageNode(newStage);
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
    }

    // forward tracking
    public void track()
    {
        if (head == null)
        {
            System.out.println("Parcel lost");
            return;
        }

        StageNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
