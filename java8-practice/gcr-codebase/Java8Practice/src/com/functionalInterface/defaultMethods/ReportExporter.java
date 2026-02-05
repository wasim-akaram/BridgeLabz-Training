package com.functionalInterface.defaultMethods;
interface ReportExporter {

    void export();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON");
    }
}

class CSVExporter implements ReportExporter {
    public void export() {
        System.out.println("Exporting to CSV");
    }
}
