package com.streamAPI.trendingMovies;
class Movie 
{
     String name;
     double rating;
     int year;

    public Movie(String name, double rating, int year) 
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

   
    @Override
    public String toString() 
    {
        return name + "  Rating: " + rating + "  Year: " + year;
    }
}
