package com.cinemahouse;
public class Main 
{

    public static void main(String[] args) 
    {

        MovieShow[] shows = {
            new MovieShow("Avengers", 2130),
            new MovieShow("Spiderman", 1530),
            new MovieShow("Penguins of Madagascar", 1100),
            new MovieShow("Zootopia", 2330),
            new MovieShow("Ice Age", 1400)
        };

        BubbleSort sorter = new BubbleSort();
        sorter.sort(shows);

        System.out.println("Today's Movie Schedule:");
        for (MovieShow show : shows) {
            System.out.println(show.movieName + " - " + show.showTime);
        }
    }
}
