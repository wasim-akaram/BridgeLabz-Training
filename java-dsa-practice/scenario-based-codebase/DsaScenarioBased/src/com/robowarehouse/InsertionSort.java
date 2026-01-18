package com.robowarehouse;
class InsertionSort 
{

    // Insertion sort by package weight (ascending)
    public void sort(Package[] packages) 
    {

        // Start from second element
        for (int i = 1; i < packages.length; i++) 
        {

            Package key = packages[i];   // current package to insert
            int j = i - 1;

            // Shift heavier packages one position ahead
            while (j >= 0 && packages[j].weight > key.weight) 
            {
                packages[j + 1] = packages[j];
                j--;
            }

            // Insert the key package at correct position
            packages[j + 1] = key;
        }
    }
}
