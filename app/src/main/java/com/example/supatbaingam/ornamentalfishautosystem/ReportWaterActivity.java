package com.example.supatbaingam.ornamentalfishautosystem;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.supatbaingam.ornamentalfishautosystem.adapter.AdapterReportWater;
import com.example.supatbaingam.ornamentalfishautosystem.model.ModelReportWater;

import java.util.ArrayList;

public class ReportWaterActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_water);

        recyclerView = (RecyclerView) findViewById(R.id.dummyfrag_scrollableview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        getReport();
    }

    private void getReport() {
        ArrayList<ModelReportWater> list = new ArrayList<ModelReportWater>();
        list.add(new ModelReportWater("1 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("2 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("3 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("4 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("5 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("6 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("7 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("8 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("9 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("10 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        list.add(new ModelReportWater("11 ก.ย. 2560","มีการเปลี่ยนน้ำ"));
        initRecycleView(list);
    }

    private void initRecycleView(ArrayList<ModelReportWater> report) {
        AdapterReportWater adapter = new AdapterReportWater(this, report);
        recyclerView.setAdapter(adapter);
    }
}
