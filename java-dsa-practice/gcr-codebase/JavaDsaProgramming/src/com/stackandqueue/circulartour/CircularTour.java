package com.stackandqueue.circulartour;



class CircularTour 
{

    public static int findStartingPump(int[] petrol, int[] distance)
    {

        int n = petrol.length;

        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < n; i++) 
        {
            surplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset start
            if (surplus < 0) {
                deficit += surplus;
                start = i + 1;
                surplus = 0;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }
}