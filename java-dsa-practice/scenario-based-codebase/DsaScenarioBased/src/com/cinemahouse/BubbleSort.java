package com.cinemahouse;
class BubbleSort 
{

    // Sort movie shows by show time (ascending)
    public void sort(MovieShow[] shows)
    {

        int n = shows.length;

        for (int i = 0; i < n - 1; i++)
        {

            // Optimization: check if already sorted
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) 
            {

                if (shows[j].showTime > shows[j + 1].showTime) 
                {

                    // Swap adjacent shows
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps, list is already sorted
            if (!swapped)
                break;
        }
    }
}
