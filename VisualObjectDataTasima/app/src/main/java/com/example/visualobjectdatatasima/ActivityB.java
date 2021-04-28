package com.example.visualobjectdatatasima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private TextView textViewOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        textViewOutput=findViewById(R.id.textViewOutput);
        String incomingData = getIntent().getStringExtra("message");
        textViewOutput.setText(incomingData);



    }
}