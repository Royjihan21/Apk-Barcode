package com.example.project_royjihanm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ACT_ListView extends AppCompatActivity{

    String[] BahasaPrograming = {"Python", "Java", "JavaScript", "C#", "PHP", "C", "R", "Objective-c","Swift","C++","SQL","Pascal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, BahasaPrograming);

        ListView listView = findViewById(R.id.listv);
        listView.setAdapter(arrayAdapter);
    }
}