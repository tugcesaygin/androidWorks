package com.example.backstackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ActivityD.this,ActivityB.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // D'den B'ye gectikten sonra geri basinca oto C'ye geciyodu bu 2 kod satiri sayesinde A B C D B A diye gidiyor.
        startActivity(intent);
    }
}