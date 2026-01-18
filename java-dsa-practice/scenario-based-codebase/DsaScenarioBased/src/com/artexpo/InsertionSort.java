package com.artexpo;
class InsertionSort 
{

    // Sort artists by registration time (ascending)
    public void sort(Artist[] artists) 
    {

        // Start from second artist
        for (int i = 1; i < artists.length; i++)
        {

            Artist key = artists[i];   // current artist to insert
            int j = i - 1;

            // Shift artists with later registration time
            while (j >= 0 && artists[j].registrationTime > key.registrationTime)
            {
                artists[j + 1] = artists[j];
                j--;
            }

            // Insert artist at correct position
            artists[j + 1] = key;
        }
    }
}
