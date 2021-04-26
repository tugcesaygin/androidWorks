package com.example.activitydatatasima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonB=findViewById(R.id.buttonB);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persons persons = new persons(99999,"Ahmet",1.85); //nesne yonelimli olani

                Intent newIntent = new Intent(MainActivity.this,ActivityB.class);
                newIntent.putExtra("message","hello");
                newIntent.putExtra("message","persons");
                startActivity(newIntent);
            }
        };
    });
}
