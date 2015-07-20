package com.gmail.antrcone.trainingdairy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.gmail.antrcone.trainingdairy.ListAdapter;
import com.gmail.antrcone.trainingdairy.R;

import java.util.ArrayList;
import java.util.List;

public class TrainingStartActivity extends MainActivity {

    private ListView listView;
    private List<String> listExercise;
    private ListAdapter listAdapter;
    FrameLayout buttonstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainingstart);

// получаем Intent, который вызывал это Activity
        Intent intentIn = getIntent();
// читаем из него action
        String nameTraining = intentIn.getStringExtra("id_tren_template");

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(nameTraining);
        }

        listView = (ListView) findViewById(R.id.list);
        listExercise = new ArrayList<>();
        listExercise.add("Подтягивания");
        listExercise.add("Отжимания");
        listExercise.add("Пресс");
        listExercise.add("Приседания");
        listAdapter = new ListAdapter(this,listExercise);
        listView.setAdapter(listAdapter);

//        int k = listExercise.size();
//        String[] exercise = new String[k];
//        for (int i = 0; i <= k; i++) {
//            exercise[i] = listExercise.get(i);
//        }

        final Intent intent = new Intent(this, TimerActivity.class);

        buttonstart = (FrameLayout) findViewById(R.id.buttonstart);
        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("START", "Najata knopka START");

//                intent.putExtra("Exercise", exercise);
                startActivity(intent);
            }
        });
    }
}
