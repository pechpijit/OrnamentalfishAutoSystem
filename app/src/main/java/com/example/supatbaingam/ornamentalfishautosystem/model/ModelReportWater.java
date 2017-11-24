package com.example.supatbaingam.ornamentalfishautosystem.model;

public class ModelReportWater {
    private String dateTime;
    private String report;

    public ModelReportWater(String dateTime, String report) {
        this.dateTime = dateTime;
        this.report = report;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
