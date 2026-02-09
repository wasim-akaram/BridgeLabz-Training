package com.workshopJava8Features;
public class LocalTimeWrapper {

    private int hour;
    private int minute;

    public LocalTimeWrapper(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int toMinutes() {
        return hour * 60 + minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
