package com.ironghui.hb_xinfang.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class BaseActivity extends AppCompatActivity {
    ArrayList<Activity> activityList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void exitApp() {
        activityList.add(this);
        for (Activity activity : activityList) {
            activity.finish();
        }
        System.exit(0);
    }

}
