package com.example.supatbaingam.ornamentalfishautosystem.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.supatbaingam.ornamentalfishautosystem.R;
import com.example.supatbaingam.ornamentalfishautosystem.model.ModelReportWater;

import java.util.ArrayList;

public class AdapterReportWater extends RecyclerView.Adapter<AdapterReportWater.VersionViewHolder> {
    ArrayList<ModelReportWater> posts;
    Context context;
    OnItemClickListener clickListener;

    public AdapterReportWater(Activity applicationContext, ArrayList posts) {
        this.context = applicationContext;
        this.posts = posts;
    }

    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_reportwater, viewGroup, false);
        return new VersionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final VersionViewHolder versionViewHolder, final int i) {
        versionViewHolder.txt_date_time.setText(posts.get(i).getDateTime());
        versionViewHolder.txt_report.setText(posts.get(i).getReport());
    }

    @Override
    public int getItemCount() {

        return posts.size();
    }

    class VersionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txt_date_time, txt_report;
        ImageView img;

        public VersionViewHolder(View itemView) {
            super(itemView);

            txt_date_time = (TextView) itemView.findViewById(R.id.txt_date_time);
            txt_report = (TextView) itemView.findViewById(R.id.txt_report);

            img = (ImageView) itemView.findViewById(R.id.image);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(v, getPosition());
        }
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);

    }

    public void SetOnItemClickListener(final OnItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
}