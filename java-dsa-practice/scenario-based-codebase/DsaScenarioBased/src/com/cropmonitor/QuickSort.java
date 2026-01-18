package com.cropmonitor;
class QuickSort 
{

    // Quick sort by timestamp
    public void quickSort(SensorData[] data, int low, int high) 
    {
        if (low < high) 
        {

            // Partition index
            int pivotIndex = partition(data, low, high);

            // Recursive calls
            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    // Partition based on timestamp
    private int partition(SensorData[] data, int low, int high) 
    {

        long pivot = data[high].timestamp;   // choose last as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {

            // Place earlier timestamps to left
            if (data[j].timestamp <= pivot) 
            {
                i++;
                swap(data, i, j);
            }
        }

        // Place pivot at correct position
        swap(data, i + 1, high);
        return i + 1;
    }

    // Swap utility
    private void swap(SensorData[] data, int i, int j) 
    {
        SensorData temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
