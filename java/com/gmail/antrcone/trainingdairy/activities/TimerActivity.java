package com.gmail.antrcone.trainingdairy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.gmail.antrcone.trainingdairy.R;

public class TimerActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

//        Intent intentIn = getIntent();
//        String[] nameTraining = intentIn.getStringArrayExtra("Exercise");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Подтягивания");
    }
}
