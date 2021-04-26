package com.example.activitydatatasima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        String incomingMessage = getIntent().getStringExtra("message");

        persons incomingPerson = (persons) getIntent().getSerializableExtra("nesne");  //kisi sinifina donusturmek icin basina person sinifini ekledik down casting

        Log.e("Incoming Message ", incomingMessage);//this code shows hello message in logcat
        Log.e("Incoming tcno ", String.valueOf(incomingPerson.getTcno()));
        Log.e("Incoming name ", incomingPerson.getName());
        Log.e("Incoming height ", String.valueOf(incomingPerson.getHeight()));

    }
}