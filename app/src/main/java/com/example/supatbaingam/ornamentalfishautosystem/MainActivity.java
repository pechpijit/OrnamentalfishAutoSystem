package com.example.supatbaingam.ornamentalfishautosystem;

import android.content.SharedPreferences;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.supatbaingam.ornamentalfishautosystem.fragment.ReportFragment;
import com.example.supatbaingam.ornamentalfishautosystem.fragment.SettingFragment;
import com.example.supatbaingam.ornamentalfishautosystem.fragment.StatusFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    Fragment selectFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.selectTabAtPosition(1);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_setting) {
                    setFram("",tabId);
                }else if (tabId == R.id.tab_status) {
                    setFram("",tabId);
                }else if (tabId == R.id.tab_report) {
                    setFram("",tabId);
                }
            }
        });


    }

    public void setFram(String s, int view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        switch (view) {
            case R.id.tab_setting:
                selectFragment = new SettingFragment();
                break;
            case R.id.tab_status:
                selectFragment = new StatusFragment();
                break;
            case R.id.tab_report:
                selectFragment = new ReportFragment();
                break;
        }

        if (selectFragment != null) {
            ft.replace(R.id.content, selectFragment);
            ft.commit();
        }
    }
}
