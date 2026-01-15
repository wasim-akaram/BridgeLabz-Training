package com.parceltracker;

public class Main
{
    public static void main(String[] args)
    {
        ParcelTrackingList parcel = new ParcelTrackingList();

        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("In Transit");
        parcel.addStage("Delivered");

        parcel.addAfter("Shipped", "Customs Check");

        parcel.track();
    }
}
