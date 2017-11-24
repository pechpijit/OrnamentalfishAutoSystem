package com.example.supatbaingam.ornamentalfishautosystem.model;

import java.util.ArrayList;

public class ModelReportFood {
    private String date;
    private ArrayList<String> activity;

    public ModelReportFood(String date, ArrayList<String> activity) {
        this.date = date;
        this.activity = activity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getActivity() {
        return activity;
    }

    public void setActivity(ArrayList<String> activity) {
        this.activity = activity;
    }
}
