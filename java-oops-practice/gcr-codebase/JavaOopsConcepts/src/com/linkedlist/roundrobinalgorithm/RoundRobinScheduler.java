package com.linkedlist.roundrobinalgorithm;



class RoundRobinScheduler 
{

	private ProcessNode current;
    private ProcessNode head;
    private ProcessNode tail;
    

    private int timeQuantum;
    private int currentTime = 0;
    private int processCount = 0;

    public RoundRobinScheduler(int timeQuantum) 
    {
        this.timeQuantum = timeQuantum;
    }

    // 1. Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        processCount++;
    }

    // 2. Remove process by PID
    private void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr == tail) {
            head = tail = current = null;
        } else {
            prev.next = curr.next;

            if (curr == head) head = curr.next;
            if (curr == tail) tail = prev;
            if (curr == current) current = curr.next;
        }

        curr.next = null;
        processCount--;
    }

    // 3. Simulate Round Robin Scheduling
    public void executeScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        ProcessNode prev = tail;

        System.out.println("----- Round Robin Scheduling Start -----");

        while (processCount > 0) {

            System.out.println("\n--- Current Queue ---");
            displayQueue();

            ProcessNode curr = current;

            int executionTime = Math.min(timeQuantum, curr.remainingTime);
            curr.remainingTime -= executionTime;
            currentTime += executionTime;

            System.out.println("Executing Process P" + curr.pid +
                               " for " + executionTime + " units");

            // Update waiting time for others
            ProcessNode temp = head;
            do {
                if (temp != curr && temp.remainingTime > 0) {
                    temp.waitingTime += executionTime;
                }
                temp = temp.next;
            } while (temp != head);

            // Process finished
            if (curr.remainingTime == 0) {
                curr.turnaroundTime = currentTime;
                System.out.println("Process P" + curr.pid + " completed");

                removeProcess(prev, curr);
            } else {
                prev = curr;
                current = curr.next;
            }
        }

        System.out.println("\n----- Scheduling Complete -----");
    }

    // 4. Display Circular Queue
    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.print("P" + temp.pid +
                             "(RT:" + temp.remainingTime + ") -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // 5. Display Average Waiting & Turnaround Time
    public void displayAverages(ProcessNode[] completed) {
        double totalWT = 0, totalTAT = 0;

        for (ProcessNode p : completed) {
            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;
        }

        System.out.println("\nAverage Waiting Time     : " +
                (totalWT / completed.length));
        System.out.println("Average Turnaround Time : " +
                (totalTAT / completed.length));
    }
}
