package com.example.supatbaingam.ornamentalfishautosystem.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.supatbaingam.ornamentalfishautosystem.R;
import com.example.supatbaingam.ornamentalfishautosystem.ReportFoodActivity;
import com.example.supatbaingam.ornamentalfishautosystem.ReportWaterActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment implements View.OnClickListener{


    public SettingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_set_sizefood:
                break;
            case R.id.btn_set_sizefish:
                break;
            case R.id.btn_set_box:
                break;
            case R.id.btn_set_fish:
                break;
            case R.id.btn_set_food:
                break;
            case R.id.btn_set_water:
                break;
        }
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return AnimationUtils.loadAnimation(getActivity(),
                enter ? android.R.anim.fade_in : android.R.anim.fade_out);
    }
}
