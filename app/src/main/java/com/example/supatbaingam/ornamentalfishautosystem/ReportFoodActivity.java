package com.example.supatbaingam.ornamentalfishautosystem;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.supatbaingam.ornamentalfishautosystem.adapter.AdapterReportFood;
import com.example.supatbaingam.ornamentalfishautosystem.adapter.AdapterReportWater;
import com.example.supatbaingam.ornamentalfishautosystem.model.ModelReportFood;
import com.example.supatbaingam.ornamentalfishautosystem.model.ModelReportWater;

import java.util.ArrayList;

public class ReportFoodActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btnBackMonth, btnNextMonth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_food);

        recyclerView = (RecyclerView) findViewById(R.id.dummyfrag_scrollableview);

        btnBackMonth = findViewById(R.id.btnBackMonth);
        btnNextMonth = findViewById(R.id.btnNextMonth);

        btnBackMonth.setText("<");
        btnNextMonth.setText(">");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        getReport();
    }

    private void getReport() {
        ArrayList<String> times = new ArrayList<String>();
        times.add("8.30");
        times.add("12.30");
        times.add("18.30");
        times.add("18.30");
        times.add("18.30");
        times.add("18.30");
        times.add("18.30");
        times.add("18.30");
        ArrayList<ModelReportFood> list = new ArrayList<ModelReportFood>();
        list.add(new ModelReportFood("1",times));
        list.add(new ModelReportFood("2",times));
        list.add(new ModelReportFood("3",times));
        list.add(new ModelReportFood("4",times));
        list.add(new ModelReportFood("5",times));
        list.add(new ModelReportFood("6",times));
        list.add(new ModelReportFood("7",times));
        list.add(new ModelReportFood("8",times));
        list.add(new ModelReportFood("9",times));
        list.add(new ModelReportFood("10",times));
        list.add(new ModelReportFood("11",times));
        initRecycleView(list);
    }

    private void initRecycleView(final ArrayList<ModelReportFood> report) {
        AdapterReportFood adapter = new AdapterReportFood(this, report);
        recyclerView.setAdapter(adapter);

        adapter.SetOnItemClickListener(new AdapterReportFood.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                String time = "";

                for (int j = 0; j < report.get(position).getActivity().size(); j++) {
                    if (j == 0) {
                        time = report.get(position).getActivity().get(j);
                    } else {
                        time += "/" + report.get(position).getActivity().get(j);
                    }
                }

                new AlertDialog.Builder(ReportFoodActivity.this)
                        .setTitle("รายละเอียด")
                        .setMessage(time.substring(0,28))
                        .setNegativeButton("ปิด", null)
                        .show();
            }
        });
    }
}
