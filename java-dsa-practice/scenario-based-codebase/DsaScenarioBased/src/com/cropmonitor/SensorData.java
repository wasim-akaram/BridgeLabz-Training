package com.cropmonitor;
class SensorData 
{
    long timestamp;     // Unix timestamp
    double temperature;

    public SensorData(long timestamp, double temperature) 
    {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}
