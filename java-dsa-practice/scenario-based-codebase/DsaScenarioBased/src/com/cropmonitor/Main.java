package com.cropmonitor;
public class Main 
{

    public static void main(String[] args) 
    {

        SensorData[] readings = {
            new SensorData(1705402100L, 24.5),
            new SensorData(1705401800L, 23.8),
            new SensorData(1705402500L, 25.1),
            new SensorData(1705401600L, 22.9),
            new SensorData(1705402300L, 24.9)
        };

        QuickSort sorter = new QuickSort();
        sorter.quickSort(readings, 0, readings.length - 1);

        System.out.println("Sensor Readings Sorted by Timestamp:");
        for (SensorData s : readings) 
        {
            System.out.println(s.timestamp + " -> " + s.temperature + "°C");
        }
    }
}
