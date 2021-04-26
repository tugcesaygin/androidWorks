package com.example.android_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Lifecycle", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Lifecycle", "onStart");
    }

    protected void onResume(){
        super.onResume();
        Log.e("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Lifecycle", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Lifecycle", "onRestart");
    }
}