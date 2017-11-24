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
import com.example.supatbaingam.ornamentalfishautosystem.model.ModelReportFood;
import com.example.supatbaingam.ornamentalfishautosystem.model.ModelReportWater;

import java.util.ArrayList;

public class AdapterReportFood extends RecyclerView.Adapter<AdapterReportFood.VersionViewHolder> {
    ArrayList<ModelReportFood> posts;
    Context context;
    OnItemClickListener clickListener;

    public AdapterReportFood(Activity applicationContext, ArrayList posts) {
        this.context = applicationContext;
        this.posts = posts;
    }

    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_reportfood, viewGroup, false);
        return new VersionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final VersionViewHolder versionViewHolder, final int i) {
        String time = "";

        for (int j = 0; j < posts.get(i).getActivity().size(); j++) {
            if (j == 0) {
                time = posts.get(i).getActivity().get(j);
            } else {
                time += "/" + posts.get(i).getActivity().get(j);
            }
        }

        versionViewHolder.txtDate.setText(posts.get(i).getDate());
        versionViewHolder.txtTime.setText(time);
    }

    @Override
    public int getItemCount() {

        return posts.size();
    }

    class VersionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtDate, txtTime;
        ImageView img;

        public VersionViewHolder(View itemView) {
            super(itemView);

            txtDate = (TextView) itemView.findViewById(R.id.txtDate);
            txtTime = (TextView) itemView.findViewById(R.id.txtTime);

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