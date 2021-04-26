package com.example.datatasima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        String incomingMessage = getIntent().getStringExtra("message");
        Persons incomingPerson = (Persons) getIntent().getSerializableExtra("nesne");

        Log.e("Incoming Persons" ,String.valueOf(incomingPerson.getTcno()));
        Log.e("Incoming Persons" ,(incomingPerson.getName()));
        Log.e("Incoming Persons" ,String.valueOf(incomingPerson.getHeight()));


    }
}