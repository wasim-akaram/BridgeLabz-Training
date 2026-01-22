package com.movietime;

class MovieShow 
{
    String movieName;
    int showTime; 

    public MovieShow(String movieName, int showTime) 
    {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() 
    {
        int hours = showTime / 60;
        int minutes = showTime % 60;
        return movieName + " at " +
                String.format("%02d:%02d", hours, minutes);
    }
}