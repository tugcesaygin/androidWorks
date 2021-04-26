package com.example.datatasima;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonB = findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Persons person = new Persons(999,"ahmet",1.70);

                Intent newIntent = new Intent(MainActivity.this,ActivityB.class);
                newIntent.putExtra("message","hello");

                newIntent.putExtra("nesne",person);
                startActivity(newIntent);


            }
        });


    }
}