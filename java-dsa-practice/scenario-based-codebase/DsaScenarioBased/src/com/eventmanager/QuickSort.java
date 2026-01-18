package com.eventmanager;
class QuickSort 
{

    // Main quick sort method
    public void quickSort(Ticket[] tickets, int low, int high) 
    {
        if (low < high) 
        {

            // Partition index
            int pivotIndex = partition(tickets, low, high);

            // Recursively sort left and right subarrays
            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    // Partition logic
    private int partition(Ticket[] tickets, int low, int high) 
    {

        // Choose last element as pivot
        double pivot = tickets[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++)
        {

            // Place smaller prices on left
            if (tickets[j].price <= pivot) 
            {
                i++;
                swap(tickets, i, j);
            }
        }

        // Place pivot in correct position
        swap(tickets, i + 1, high);
        return i + 1;
    }

    // Swap utility
    private void swap(Ticket[] tickets, int i, int j)
    {
        Ticket temp = tickets[i];
        tickets[i] = tickets[j];
        tickets[j] = temp;
    }
}
