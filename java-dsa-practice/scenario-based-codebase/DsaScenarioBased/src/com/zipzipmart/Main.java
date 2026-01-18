package com.zipzipmart;

public class Main
{

    public static void main(String[] args) 
    {

        SalesRecord[] sales = {
            new SalesRecord("2026-01-10", 450.0),
            new SalesRecord("2026-01-08", 200.0),
            new SalesRecord("2026-01-10", 150.0),
            new SalesRecord("2026-01-09", 300.0),
            new SalesRecord("2026-01-08", 200.0)
        };

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(sales, 0, sales.length - 1);

        System.out.println("Daily Sales Summary Report:");
        for (SalesRecord s : sales) 
        {
            System.out.println(s.date + "  ₹" + s.amount);
        }
    }
}
