package com.example.supatbaingam.ornamentalfishautosystem.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.supatbaingam.ornamentalfishautosystem.MainActivity;
import com.example.supatbaingam.ornamentalfishautosystem.R;
import com.example.supatbaingam.ornamentalfishautosystem.ReportFoodActivity;
import com.example.supatbaingam.ornamentalfishautosystem.ReportWaterActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReportFragment extends Fragment {

    String TAG = "ReportFragment";

    public ReportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_report, container, false);

        view.findViewById(R.id.btn_reportwater).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "click report water");
                getActivity().startActivity(new Intent(getActivity(), ReportWaterActivity.class));
                getActivity().overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });

        view.findViewById(R.id.btn_reportfood).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "click report food");
                getActivity().startActivity(new Intent(getActivity(), ReportFoodActivity.class));
                getActivity().overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });
        return view;
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return AnimationUtils.loadAnimation(getActivity(),
                enter ? android.R.anim.fade_in : android.R.anim.fade_out);
    }
}
